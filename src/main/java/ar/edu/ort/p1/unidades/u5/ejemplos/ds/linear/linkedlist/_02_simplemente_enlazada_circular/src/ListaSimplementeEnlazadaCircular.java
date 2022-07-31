package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._02_simplemente_enlazada_circular.src;

import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.interfaces.Tda;

public class ListaSimplementeEnlazadaCircular<T> implements Tda {

	private Nodo<T> tail = null;
	private int size = 0;

	// Constructor
	public ListaSimplementeEnlazadaCircular() {
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
		if (isEmpty()) {
			return null;
		}
		return tail.next().getElement(); // the head is *after* the tail
	}

	/**
	 * Returns (but does not remove) the last element
	 * 
	 * @return
	 */
	public T last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	public void rotate() { // rotate the first element to the back of the list
		if (tail != null) // if empty, do nothing
			tail = tail.next(); // the old head becomes the new tail
	}

	/**
	 * Adds element e to the front of the list
	 * 
	 * @param e
	 */
	public void addFirst(T e) {

		if (size == 0) {
			this.tail = new Nodo<>(e);
			this.tail.next(this.tail); // link to itself circularly
		} else {
			// Nodo<E> newest = new Nodo<>(e, tail.getNext());
			// tail.next(newest);

			Nodo<T> nuevoNodo = new Nodo<T>(e);
			nuevoNodo.next(this.tail.next());
			this.tail.next(nuevoNodo);
		}
		size++;
	}

	public void addLast(T e) { // adds element e to the end of the list
		addFirst(e); // insert new element at front of list
		tail = tail.next(); // now new element becomes the tail
	}

	public T removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		Nodo<T> head = tail.next();
		if (head == tail) {
			tail = null; // must be the only node left
		} else {
			tail.next(head.next()); // removes "head" from the list
			// tail.setNext(head.getNext()); // removes "head" from the list
		}
		size--;
		return head.getElement();
	}

	/**
	 * Prints out the list in an array format
	 */
	@Override
	public String toString() {
		String resString = "[ ";
		Nodo<T> X = tail;

		if (X == null) {
			return resString + " ]";
		}
		while (X.next() != null) {
			resString += String.valueOf(X.getElement()) + " - ";
			X = X.next();
		}
		resString += String.valueOf(X.getElement());

		return resString + " ]";
	}

	/**
	 * Mustra en pantalla los elementos de la lista.
	 */
	public void mostrar() {
		if (!isEmpty()) {
			Nodo aux = tail.next();
			int i = 0;
			System.out.print("-> ");
			while (aux != tail) {
				System.out.print("[" + aux.getElement() + "]" + " -> ");
				aux = aux.next();
				i++;
			}
			System.out.print("[" + tail.getElement() + "]" + " -> ");
		}
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkFullness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

}