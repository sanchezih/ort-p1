package edu.ort.u5.ejemplos.lista_enlazada_simple_gen;

public class Nodo<T> {
	T elemento;
	Nodo<T> next;

	Nodo(T elemento) {
		this.elemento = elemento;
		this.next = null;
	}
}