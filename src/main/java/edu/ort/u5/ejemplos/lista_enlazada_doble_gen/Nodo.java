package edu.ort.u5.ejemplos.lista_enlazada_doble_gen;

/**
 * The class Node wraps the nodes for the doubly linked list. Its constructor
 * receives pointers to next and previous nodes, as well as, an object to which
 * will be the node's value.
 */
public class Nodo<T> {
	T elemento;
	Nodo next;
	Nodo previous;

	Nodo() {
	}

	Nodo(Nodo next, Nodo previous, T elemento) {
		this.next = next;
		this.previous = previous;
		this.elemento = elemento;
	}

}