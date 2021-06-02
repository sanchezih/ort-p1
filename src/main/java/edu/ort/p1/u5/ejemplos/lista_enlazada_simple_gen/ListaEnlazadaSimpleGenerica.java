package edu.ort.p1.u5.ejemplos.lista_enlazada_simple_gen;

public class ListaEnlazadaSimpleGenerica<TipoElemento> {

	Nodo<TipoElemento> head;
	private int length = 0;

	ListaEnlazadaSimpleGenerica() {
		this.head = null;
	}

	// Agrega un nodo al final de la lista
	void add(TipoElemento elemento) {

		// Creating new node with given value
		Nodo<TipoElemento> temp = new Nodo<>(elemento);

		// Checking if list is empty
		// and assigning new value to head node
		if (this.head == null) {
			head = temp;
		}

		// If list already exists
		else {

			// Temporary node for traversal
			Nodo<TipoElemento> X = head;

			// Iterating till end of the List
			while (X.siguiente != null) {
				X = X.siguiente;
			}

			// Adding new valued node at the end of the list
			X.siguiente = temp;
		}

		// Increasing length after adding new node
		length++;
	}

	// Method
	// To add new node at any given position
	void add(int posicion, TipoElemento elemento) {

		// Checking if position is valid
		if (posicion > length + 1) {

			// Display message only
			System.out.println("Position Unavailable in LikedList");
			return;
		}

		// If new position is head then replace head node
		if (posicion == 1) {

			// Temporary node that stores previous head
			// value
			Nodo<TipoElemento> temp = head;

			// New valued node stored in head
			head = new Nodo<TipoElemento>(elemento);

			// New head node pointing to old head node
			head.siguiente = temp;

			return;
		}

		// Temporary node for traversal
		Nodo<TipoElemento> temp = head;

		// Dummy node with null value that stores previous
		// node
		Nodo<TipoElemento> prev = new Nodo<TipoElemento>(null);
		// interating to the given position
		while (posicion - 1 > 0) {
			// assigning previous node
			prev = temp;
			// incrementing next node
			temp = temp.siguiente;
			// decreasing position counter
			posicion--;
		}
		// previous node now points to new value
		prev.siguiente = new Nodo<TipoElemento>(elemento);
		// new value now points to former current node
		prev.siguiente.siguiente = temp;
	}

	// Method
	// To remove a node from list
	void remove(TipoElemento key) {

		// NOTE
		// dummy node is used to represent the node before
		// the current node Since in a Singly Linked-List we
		// cannot go backwards from a node, we use a dummy
		// node to represent the previous node. In case of
		// head node, since there is no previous node, the
		// previous node is assigned to null.

		// Dummy node with null value
		Nodo<TipoElemento> prev = new Nodo<>(null);

		// Dummy node pointing to head node
		prev.siguiente = head;

		// Next node that points ahead of current node
		Nodo<TipoElemento> next = head.siguiente;

		// Temporary node for traversal
		Nodo<TipoElemento> temp = head;

		// Boolean value that checks whether value to be
		// deleted exists or not
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

	void clear() {
		head = null;
		length = 0;
	}

	boolean isEmpty() {
		return head != null ? false : true;
	}

	int length() {
		return this.length;
	}

	@Override
	public String toString() {
		String S = "[ ";
		Nodo<TipoElemento> X = head;
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