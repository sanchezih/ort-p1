package edu.ort.u5.ejemplos.pila.pila_generica_con_lista_enlazada;

public class Nodo<TipoElemento> {
	private TipoElemento elemento;
	private Nodo<TipoElemento> next;

	public Nodo(TipoElemento elemento) {
		this.elemento = elemento;
		this.next = null;
	}

	public TipoElemento getElemento() {
		return elemento;
	}

	public void setElemento(TipoElemento elemento) {
		this.elemento = elemento;
	}

	public Nodo<TipoElemento> getNext() {
		return next;
	}

	public void setNext(Nodo<TipoElemento> next) {
		this.next = next;
	}

	public boolean hasNext() {
		return next != null;
	}

}