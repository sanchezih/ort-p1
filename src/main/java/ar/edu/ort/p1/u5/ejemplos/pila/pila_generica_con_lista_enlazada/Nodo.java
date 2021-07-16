package edu.ort.p1.u5.ejemplos.pila.pila_generica_con_lista_enlazada;

public class Nodo<T> {
	private T elemento;
	private Nodo<T> next;

	public Nodo(T elemento) {
		this.elemento = elemento;
		this.next = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public boolean hasNext() {
		return next != null;
	}

}