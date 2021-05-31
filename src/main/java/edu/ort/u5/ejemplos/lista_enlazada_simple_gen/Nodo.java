package edu.ort.u5.ejemplos.lista_enlazada_simple_gen;

public class Nodo<TipoElemento> {
	TipoElemento elemento;
	Nodo<TipoElemento> siguiente;

	Nodo() {
	}

	Nodo(TipoElemento elemento) {
		this.elemento = elemento;
		this.siguiente = null;
	}
}