package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_lista_enlazada_simple_gen.src;

public class Nodo<T> {

	private T element; // reference to the element stored at this node
	private Nodo<T> next; // reference to the subsequent node in the list

	public Nodo(T e, Nodo<T> n) {
		element = e;
		next = n;
	}

	public T getElement() {
		return element;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> n) {
		next = n;
	}
}