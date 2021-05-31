package edu.ort.u5.ejemplos.lista_enlazada_doble_gen;

public class ListaEnlazadaDobleGenerica<TipoElemento> {

	private Nodo<TipoElemento> header;

	ListaEnlazadaDobleGenerica() {
		header = new Nodo<TipoElemento>(null, null, null);
	}

	/**
	 * Add before the first item in the list
	 */
	public Nodo<TipoElemento> addFirst(TipoElemento elemento) {
		Nodo nodo = new Nodo(header.next, header, elemento);
		if (header.next != null) {
			header.next.previous = nodo;
		}
		header.next = nodo;
		return nodo;
	}

	/**
	 * Add after the last item in the list
	 */
	public Nodo add(TipoElemento item) {
		Nodo end = getNode(size() - 1);
		Nodo next = new Nodo(null, end, item);
		end.next = next;
		return next;
	}

	/**
	 * Add anywhere in the list, after the index of position index
	 */
	public Nodo add(TipoElemento elemento, int index) {
		if (index >= size() || index < 0) {
			throw new IndexOutOfBoundsException("pos = " + index + " does not exist");
		}

		Nodo nodeIns = null;

		if (elemento != null) {
			Nodo node = header;

			if (node.next != null) {
				for (int i = 0; i <= index; i++) {
					node = node.next;
				}
			}

			nodeIns = new Nodo(node.next, node, elemento);

			if (node.next != null) {
				node.next.previous = nodeIns;
			}
			node.next = nodeIns;
		}
		return nodeIns;
	}

	/**
	 * Delete the first item of the list
	 */
	public Nodo deleteFirst() {
		Nodo temp = getNode(0);
		if (temp != null && temp.next != null) {
			temp.next.previous = header;
			header.next = temp.next;
		} else {
			header.next = null;
		}

		return temp;
	}

	/**
	 * Delete the last item of the list
	 */
	public Nodo deleteLast() {
		Nodo temp = getNode(size() - 1);
		Nodo newLast = getNode(size() - 2);
		newLast.next = null;
		return temp;
	}

	/**
	 * Delete object at specified index
	 */
	public boolean delete(int index) {
		if (index >= size() || index < 0) {
			throw new IndexOutOfBoundsException("pos = " + index + " does not exist");
		}
		Nodo toBeRemoved = getNode(index);
		if (toBeRemoved == null)
			return false;
		Nodo previous = toBeRemoved.previous;
		Nodo next = toBeRemoved.next;

		previous.next = next;
		if (next != null) {
			next.previous = toBeRemoved.previous;
		}
		toBeRemoved = null;
		return true;
	}

	/**
	 * Delete by specifying object -- removes first occurrence of a string
	 */
	public boolean delete(TipoElemento elemento) {
		int index = find(elemento);
		if (index == -1)
			return false;
		return delete(index);

	}

	/**
	 * Get the specific node we are looking for at the position index
	 */
	private Nodo getNode(int index) {
		if (index > size())
			throw new IndexOutOfBoundsException();
		Nodo node = header;
		for (int i = 0; i <= index; ++i) {
			node = node.next;
		}

		return node;
	}

	/**
	 * Get the value of the node we are looking for at the position index
	 */
	public String get(int index) {
		Nodo node = getNode(index);
		return (node != null) ? node.elemento.toString() : null;
	}

	/**
	 * Returns the index of the String s, if found; -1 otherwise
	 */
	public int find(TipoElemento elemento) {
		if (elemento == null)
			return -1;
		Nodo currentNode = header;
		int i = -1;
		while (currentNode.next != null) {
			++i;
			currentNode = currentNode.next;
			if (elemento.equals(currentNode.elemento))
				return i;
		}
		return -1;
	}

	/**
	 * Returns the size of the list
	 */
	public int size() {
		int count = 0;
		Nodo nodo = header.next;
		while (nodo != null) {
			++count;
			nodo = nodo.next;
		}
		return count;
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
		Nodo next = header.next;
		while (next != null) {
			sb.append(next.elemento + ", ");
			next = next.next;
		}
		String ret = sb.toString();
		if (ret.length() > 1) {
			ret = ret.substring(0, ret.length() - 2);
		}
		return (ret + "]");
	}

}