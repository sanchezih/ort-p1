package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.cola.impl_linkedlist;

import ar.edu.ort.tp1.u5.tda.Cola;
import ar.edu.ort.tp1.u5.tda.nodos.Nodo;

public class ColaListaEnlazada<T> implements Cola<T> {

	private Nodo<T> first;
	private Nodo<T> last;
	private int size;

	public ColaListaEnlazada() {
		last = null;
		size = 0;
	}

	@Override
	public int count() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
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

	@Override
	public void add(T element) {
		Nodo<T> nuevoNodo = new Nodo<T>(element);
		if (first == null) {
			first = nuevoNodo;
			last = nuevoNodo;
		} else {
			last.next(nuevoNodo);
			last = nuevoNodo;
		}
		size++;
	}

	@Override
	public T remove() {
		if (first == null) {
			return null;
		}
		T o = first.getElement();
		first = first.next();
		size--;
		return o;
	}

	@Override
	public T get() {
		if (first == null)
			return null;
		else
			return first.getElement();
	}

}