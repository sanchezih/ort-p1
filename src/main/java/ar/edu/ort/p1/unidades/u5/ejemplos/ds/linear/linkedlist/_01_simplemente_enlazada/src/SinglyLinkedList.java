package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.impl.TdaNodos;

public class SinglyLinkedList<T> extends TdaNodos<T> {

	private Nodo<T> head = null;
	private Nodo<T> tail = null;
	// private int size = 0; // number of nodes in the list

	// Constructores
	public SinglyLinkedList() {
		super();
	}

	public SinglyLinkedList(int tope) {
		super(tope);
	}

	// Metodos
	public void addFirst(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (getCurrentSize() == 0) {
			this.tail = this.head = nuevoNodo;
		} else {
			nuevoNodo.next(this.head);
			this.head = nuevoNodo;
		}
		incrementSize();
	}

	public void addLast(T elemento) {
		Nodo<T> newest = new Nodo<>(elemento);
		if (isEmpty()) {
			head = newest;
		} else {
			this.tail.next(newest);
		}
		tail = newest;
		incrementSize();
	}

	public T removeFirst() {
		if (isEmpty()) {
			return null;
		}
		T answer = head.getElement();
		head = head.next();
		decrementSize();
		if (getCurrentSize() == 0) {
			tail = null;
		}
		return answer;
	}

	public T getFirst() {
		return (isEmpty()) ? null : this.head.getElement();
	}

	public T getLast() {
		return (isEmpty()) ? null : this.tail.getElement();
	}

	@Override
	public String toString() {
		String resString = "[ ";
		Nodo<T> X = head;

		if (X == null) {
			return resString + " ]";
		}
		while (X.next() != null) {
			resString += String.valueOf(X.getElement()) + " -> ";
			X = X.next();
		}
		resString += String.valueOf(X.getElement());

		return resString + " ]";
	}

}