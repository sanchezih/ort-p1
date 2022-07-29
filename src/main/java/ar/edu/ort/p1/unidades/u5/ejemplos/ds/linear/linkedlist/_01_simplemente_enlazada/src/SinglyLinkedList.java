package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.interfaces.Tda;

public class SinglyLinkedList<T> implements Tda {

	private Nodo<T> head = null; // head node of the list (or null if empty)
	private Nodo<T> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	// Constructor
	public SinglyLinkedList() {
	}

	// Metodos
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns (but does not remove) the first element
	 * 
	 * @return
	 */
	public T first() {
		return (isEmpty()) ? null : this.head.getElement();
	}

	/**
	 * Returns (but does not remove) the last element
	 * 
	 * @return
	 */
	public T last() {
		return (isEmpty()) ? null : this.tail.getElement();
	}

	public void addFirst(T elemento) { // adds element e to the front of the list
		// head = new Nodo<>(e, head); // create and link a new node
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (size == 0) {
			this.tail = this.head = nuevoNodo; // special case: new node becomes tail also
		} else {
			nuevoNodo.next(this.head);
			this.head = nuevoNodo;
		}
		this.size++;
	}

	/**
	 * Adds element e to the end of the list
	 * 
	 * @param elemento
	 */
	public void addLast(T elemento) {
		Nodo<T> newest = new Nodo<>(elemento); // node will eventually be the tail
		if (isEmpty()) {
			head = newest; // special case: previously empty list
		} else {
			this.tail.next(newest); // new node after existing tail
		}
		tail = newest; // new node becomes the tail
		size++;
	}

	public T removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		T answer = head.getElement();
		head = head.next(); // will become null if list had only one node
		size--;
		if (size == 0)
			tail = null; // special case as list is now empty
		return answer;
	}

	/**
	 * Prints out the list in an array format
	 */
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

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {
		if (isEmpty()) {
			throw new RuntimeException(
					String.format(ERR_ESTRUCTURA_VACIA, this.getClass().getInterfaces()[0].getSimpleName()));
		}
	}

	@Override
	public void checkFullness() throws RuntimeException {
		// TODO Auto-generated method stub
	}
}