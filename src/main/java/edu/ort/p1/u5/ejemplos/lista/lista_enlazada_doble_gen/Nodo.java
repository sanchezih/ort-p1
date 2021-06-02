package edu.ort.p1.u5.ejemplos.lista.lista_enlazada_doble_gen;

/**
 * The class Node wraps the nodes for the doubly linked list. Its constructor
 * receives pointers to next and previous nodes, as well as, an object to which
 * will be the node's value.
 */
public class Nodo<TipoElemento> {
	TipoElemento elemento;
	Nodo<TipoElemento> siguiente;
	Nodo<TipoElemento> previo;

	Nodo() {
	}

	Nodo(Nodo<TipoElemento> siguiente, Nodo<TipoElemento> previo, TipoElemento elemento) {
		this.siguiente = siguiente;
		this.previo = previo;
		this.elemento = elemento;
	}

}