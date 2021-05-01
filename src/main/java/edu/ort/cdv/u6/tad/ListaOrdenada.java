package edu.ort.cdv.u6.tad;

import java.util.Iterator;

public abstract class ListaOrdenada<K, T> implements Iterable<T> {
	private static final String MSG_INVALID_KEY = "Clave invalida";
	private static final String MSG_INDEX_OUT_OF_RANGE = "Indice fuera de rango: El maximo es %d";
	private static final String MSG_LIST_EMPTY = "La lista esta vacia";
	private static final String MSG_NULL_NODE = "El nodo es null";
	private static final String MSG_LIST_FULL = "Lista llena";
	private static final String MSG_INVALID_PARAMETER = "Parametro invalido";
	private static final String MSG_ELEM_IS_NULL = "El elemento no puede ser Null";
	
	protected class NodoLista {

		private T value;
		private NodoLista next;
		private NodoLista previous;

		public NodoLista(T dato) {
			this.value = dato;
			this.previous = null;
			this.next = null;
		}

		public NodoLista previous() {
			return previous;
		}
		
		public NodoLista next() {
			return next;
		}

		public void previous(NodoLista previous) {
			this.previous = previous;
		}

		public void next(NodoLista next) {
			this.next = next;
		}

		public T getValue() {
			return value;
		}

		/**
		 * @return valor booleano indicando si hay un nodo anterior (si no es el primero de la lista)
		 */
		public boolean hasPrev() {
			return previous != null;
		}

		/**
		 * @return valor booleano indicando si hay un nodo posterior (si no es el último de la lista)
		 */
		public boolean hasNext() {
			return next != null;
		}


	}
	
	protected class ListaOrdenadaIterator implements Iterator<T> {

		private NodoLista current;

		public ListaOrdenadaIterator(NodoLista first) {
			this.current = first;
		}
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T e = current.getValue();
			current = current.next();
			return e;
		}

	}
	
	private NodoLista first;
	private NodoLista last;
	private int count;
	private int maxSize;

	public ListaOrdenada() {
		this(Integer.MIN_VALUE);
	}

	public ListaOrdenada(int maxSize) {
		if (maxSize < 1 && maxSize != Integer.MIN_VALUE) {
			throw new IllegalArgumentException(MSG_INVALID_PARAMETER);
		}
		this.first = null;
		this.last = null;
		this.maxSize = maxSize;
		this.count = 0;
	}

	public void add(T newElement) {
		if (isFull()) {
			throw new RuntimeException(MSG_LIST_FULL);
		}
		NodoLista node = new NodoLista(newElement);
		if (isEmpty()) {
			// es el primer nodo (lista vacia)
			first = node;
			last = node;
		} else if (compare(newElement, first.getValue()) < 0) {
			// tiene que quedar antes que el first
			node.next(first);
			first.previous(node);
			first = node;
		} else if (compare(newElement, last.getValue()) > 0) {
			// tiene que quedar despues del last
			node.previous(last);
			last.next(node);
			last = node;
		} else {
			// sino, es alguno de los que va en el medio
			// (tengo que BUSCAR)
			NodoLista aux = first;
			while (compare(newElement, aux.next().getValue()) > 0) {
				aux = aux.next();
			}
			node.next(aux.next());
			aux.next(node);
			node.previous(aux);
			if (node.hasNext()) {
				node.next().previous(node);
			}
		}
		count++;
	}

	protected abstract int compare(T dato1, T dato2);

	protected abstract int compareByKey(K clave, T elemento);

	public boolean exists(K key) {
		NodoLista node = searchByKey(key);
		return node != null && compareByKey(key, node.getValue()) == 0;
	}

	private T extract(NodoLista node) {
		if (node == null) {
			throw new IllegalArgumentException(MSG_NULL_NODE);
		}
		T element;
		element = node.getValue();
		// desengancho el nodo de la lista
		if (node.hasPrev()) {
			node.previous().next(node.next());
		} else {
			first = node.next();
		}
		if (node.hasNext()) {
			node.next().previous(node.previous());
		}
		count--;
		return element;
	}

	/**
	 * Devuelve el elemento en la posicion numero pos de la lista.
	 * 
	 * @param pos
	 *            la posicion buscada (base 0)
	 * @return el elemento de esa posicion
	 */
	public T get(int pos) {
		T dato = null;
		NodoLista aux = getNodeAt(pos);
		if (aux != null) {
			dato = aux.getValue();
		}
		return dato;
	}

	protected NodoLista getFirst() {
		return first;
	}

	/**
	 * @param pos
	 * @return
	 */
	private NodoLista getNodeAt(int pos) {
		if (isEmpty()) {
			throw new RuntimeException(MSG_LIST_EMPTY);
		} else if (pos < 0 || pos >= count) {
			throw new IndexOutOfBoundsException(String.format(MSG_INDEX_OUT_OF_RANGE, count));
		}
		NodoLista aux = first;
		for (int i = 0; i < pos; i++) {
			aux = aux.next();
		}
		return aux;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public boolean isFull() {
		return (maxSize != -Integer.MAX_VALUE && count == maxSize);
	}

	/**
	 * Remueve el elemento en la posicion pos de la lista.
	 * 
	 * @param pos
	 *            La posicion (base 0).
	 * @return El elemento removido o null.
	 */
	public T remove(int pos) {
		return extract(getNodeAt(pos));
	}

	/**
	 * Remueve el primer elemento cuya clave coincide con la clave recibida.
	 * 
	 * @param elem
	 *            La clave del elemento a buscar.
	 * @return El elemento removido o null.
	 */
	public boolean remove(T elem) {
		if (isEmpty()) {
			throw new RuntimeException(MSG_LIST_EMPTY);
		}
		if (elem == null) {
			throw new IllegalArgumentException(MSG_ELEM_IS_NULL);
		}
		boolean result = false;
		NodoLista node = first;
		while (node != null && !elem.equals(node.getValue())) {
			node = node.next();
		}
		if (node != null) {
			extract(node);
			result = true;
		}
		return result;
	}

	public T search(K key) {
		NodoLista node = searchByKey(key);
		T element = null;
		if (node != null && compareByKey(key, node.getValue()) == 0) {
			element = node.getValue();
		}
		return element;
	}

	private NodoLista searchByKey(K key) {
		if (key == null) {
			throw new IllegalArgumentException(MSG_INVALID_KEY);
		}
		NodoLista aux = first;
		while (aux != null && compareByKey(key, aux.getValue()) > 0) {
			aux = aux.next();
		}
		return aux;
	}

	@Override
	public Iterator<T> iterator() {
		return new ListaOrdenadaIterator(getFirst());
	}

}