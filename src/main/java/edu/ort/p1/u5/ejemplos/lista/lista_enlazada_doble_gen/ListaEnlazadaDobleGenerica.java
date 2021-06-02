package edu.ort.p1.u5.ejemplos.lista.lista_enlazada_doble_gen;

public class ListaEnlazadaDobleGenerica<T> {

	private Nodo<T> header;

	ListaEnlazadaDobleGenerica() {
		header = new Nodo<T>(null, null, null);
	}

	/**
	 * Add before the first item in the list
	 */
	public Nodo<T> addFirst(T elemento) {
		Nodo<T> nodo = new Nodo<T>(header.siguiente, header, elemento);
		if (header.siguiente != null) {
			header.siguiente.previo = nodo;
		}
		header.siguiente = nodo;
		return nodo;
	}

	/**
	 * Add after the last item in the list
	 */
	public Nodo<T> add(T elemento) {
		Nodo<T> end = getNode(size() - 1);
		Nodo siguiente = new Nodo(null, end, elemento);
		end.siguiente = siguiente;
		return siguiente;
	}

	/**
	 * Add anywhere in the list, after the index of position index
	 */
	public Nodo<T> add(T elemento, int indice) {
		if (indice >= size() || indice < 0) {
			throw new IndexOutOfBoundsException("pos = " + indice + " no existe");
		}

		Nodo<T> nodeIns = null;

		if (elemento != null) {
			Nodo<T> node = header;

			if (node.siguiente != null) {
				for (int i = 0; i <= indice; i++) {
					node = node.siguiente;
				}
			}

			nodeIns = new Nodo(node.siguiente, node, elemento);

			if (node.siguiente != null) {
				node.siguiente.previo = nodeIns;
			}
			node.siguiente = nodeIns;
		}
		return nodeIns;
	}

	/**
	 * Delete the first item of the list
	 */
	public Nodo<T> deleteFirst() {
		Nodo<T> temp = getNode(0);
		if (temp != null && temp.siguiente != null) {
			temp.siguiente.previo = header;
			header.siguiente = temp.siguiente;
		} else {
			header.siguiente = null;
		}

		return temp;
	}

	/**
	 * Delete the last item of the list
	 */
	public Nodo<T> deleteLast() {
		Nodo<T> temp = getNode(size() - 1);
		Nodo<T> newLast = getNode(size() - 2);
		newLast.siguiente = null;
		return temp;
	}

	/**
	 * Delete object at specified index
	 */
	public boolean delete(int indice) {
		if (indice >= size() || indice < 0) {
			throw new IndexOutOfBoundsException("pos = " + indice + " no existe");
		}
		Nodo<T> toBeRemoved = getNode(indice);
		if (toBeRemoved == null) {
			return false;
		}
		Nodo<T> previo = toBeRemoved.previo;
		Nodo<T> siguiente = toBeRemoved.siguiente;

		previo.siguiente = siguiente;
		if (siguiente != null) {
			siguiente.previo = toBeRemoved.previo;
		}
		toBeRemoved = null;
		return true;
	}

	/**
	 * Delete by specifying object -- removes first occurrence of a string
	 */
	public boolean delete(T elemento) {
		int indice = find(elemento);
		if (indice == -1)
			return false;
		return delete(indice);

	}

	/**
	 * Get the specific node we are looking for at the position index
	 */
	private Nodo<T> getNode(int indice) {
		if (indice > size()) {
			throw new IndexOutOfBoundsException();
		}
		Nodo<T> node = header;
		for (int i = 0; i <= indice; ++i) {
			node = node.siguiente;
		}
		return node;
	}

	/**
	 * Get the value of the node we are looking for at the position index
	 */
	public String get(int indice) {
		Nodo<T> nodo = getNode(indice);
		return (nodo != null) ? nodo.elemento.toString() : null;
	}

	/**
	 * Returns the index of the String s, if found; -1 otherwise
	 */
	public int find(T elemento) {
		if (elemento == null)
			return -1;
		Nodo<T> currentNode = header;
		int i = -1;
		while (currentNode.siguiente != null) {
			++i;
			currentNode = currentNode.siguiente;
			if (elemento.equals(currentNode.elemento))
				return i;
		}
		return -1;
	}

	/**
	 * Returns the size of the list
	 */
	public int size() {
		int cont = 0;
		Nodo<T> nodo = header.siguiente;
		while (nodo != null) {
			++cont;
			nodo = nodo.siguiente;
		}
		return cont;
	}

	/**
	 * Returns true if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return size() > 0 ? false : true;
	}

	/**
	 * Prints out the list in an array format
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Nodo<T> next = header.siguiente;
		while (next != null) {
			sb.append(next.elemento + ", ");
			next = next.siguiente;
		}
		String ret = sb.toString();
		if (ret.length() > 1) {
			ret = ret.substring(0, ret.length() - 2);
		}
		return (ret + "]");
	}

}