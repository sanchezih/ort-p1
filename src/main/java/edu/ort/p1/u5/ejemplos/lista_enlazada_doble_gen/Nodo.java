package edu.ort.p1.u5.ejemplos.lista_enlazada_doble_gen;

/**
 * The class Node wraps the nodes for the doubly linked list. Its constructor
 * receives pointers to next and previous nodes, as well as, an object to which
 * will be the node's value.
 */
public class Nodo<TipoElemento> {
	TipoElemento elemento;
	Nodo<TipoElemento> next;
	Nodo<TipoElemento> previous;

	Nodo() {
	}

	Nodo(Nodo<TipoElemento> next, Nodo<TipoElemento> previous, TipoElemento elemento) {
		this.next = next;
		this.previous = previous;
		this.elemento = elemento;
	}

}