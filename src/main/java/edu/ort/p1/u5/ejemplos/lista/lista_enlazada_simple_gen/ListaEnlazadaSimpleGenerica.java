package edu.ort.p1.u5.ejemplos.lista.lista_enlazada_simple_gen;

public class ListaEnlazadaSimpleGenerica<T> {

	private Nodo<T> head;
	private int length = 0;

	public ListaEnlazadaSimpleGenerica() {
		this.head = null;
	}

	// Agrega un nodo al final de la lista
	public void add(T elemento) {

		Nodo<T> temp = new Nodo<>(elemento);

		if (this.head == null) {
			head = temp;
		} else {
			Nodo<T> X = head;
			while (X.siguiente != null) {
				X = X.siguiente;
			}
			X.siguiente = temp;
		}
		length++;
	}

	// Agrega un nodo en una posicion especifica
	public void add(int posicion, T elemento) {

		if (posicion > length + 1) {
			System.out.println("Position Unavailable in LikedList");
			return;
		}

		if (posicion == 1) {
			Nodo<T> temp = head;
			head = new Nodo<T>(elemento);

			head.siguiente = temp;

			return;
		}

		// Temporary node for traversal
		Nodo<T> temp = head;

		// Dummy node with null value that stores previous node
		Nodo<T> prev = new Nodo<T>(null);

		// interating to the given position
		while (posicion - 1 > 0) {
			prev = temp; // assigning previous node
			temp = temp.siguiente; // incrementing next node
			posicion--; // decreasing position counter

		}
		// previous node now points to new value
		prev.siguiente = new Nodo<T>(elemento);
		// new value now points to former current node
		prev.siguiente.siguiente = temp;
	}

	public void remove(T key) {

		// NOTE
		// dummy node is used to represent the node before
		// the current node Since in a Singly Linked-List we
		// cannot go backwards from a node, we use a dummy
		// node to represent the previous node. In case of
		// head node, since there is no previous node, the
		// previous node is assigned to null.

		// Dummy node with null value
		Nodo<T> prev = new Nodo<>(null);

		// Dummy node pointing to head node
		prev.siguiente = head;

		// Next node that points ahead of current node
		Nodo<T> next = head.siguiente;

		// Temporary node for traversal
		Nodo<T> temp = head;

		// Boolean value that checks whether value to be deleted exists or not
		boolean exists = false;

		// If head node needs to be deleted
		if (head.elemento == key) {
			head = head.siguiente;

			// Node to be deleted exists
			exists = true;
		}

		// Iterating over LinkedList
		while (temp.siguiente != null) {

			// We convert value to be compared into Strings
			// and then compare using
			// String1.equals(String2) method

			// Comparing value of key and current node
			if (String.valueOf(temp.elemento).equals(String.valueOf(key))) {

				// If node to be deleted is found previous
				// node now points to next node skipping the
				// current node
				prev.siguiente = next;
				// node to be deleted exists
				exists = true;

				// As soon as we find the node to be deleted
				// we exit the loop
				break;
			}

			// Previous node now points to current node
			prev = temp;

			// Current node now points to next node
			temp = temp.siguiente;

			// Next node points the node ahead of current
			// node
			next = temp.siguiente;
		}

		// Comparing the last node with the given key value
		if (exists == false && String.valueOf(temp.elemento).equals(String.valueOf(key))) {

			// If found , last node is skipped over
			prev.siguiente = null;

			// Node to be deleted exists
			exists = true;
		}

		// If node to be deleted exists
		if (exists) {

			// Length of LinkedList reduced
			length--;
		}

		// If node to be deleted does not exist
		else {

			// Print statement
			System.out.println("Given Value is not present in linked list");
		}
	}

	public void clear() {
		head = null;
		length = 0;
	}

	public boolean isEmpty() {
		return head != null ? false : true;
	}

	public int length() {
		return this.length;
	}

	@Override
	public String toString() {
		String S = "[ ";
		Nodo<T> X = head;
		if (X == null) {
			return S + " ]";
		}
		while (X.siguiente != null) {
			S += String.valueOf(X.elemento) + " -> ";
			X = X.siguiente;
		}
		S += String.valueOf(X.elemento);
		return S + " ]";
	}

}