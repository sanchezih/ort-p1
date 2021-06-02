package edu.ort.tp1.u5.tda.nodos;

import edu.ort.tp1.u5.tda.Cola;

public class ColaNodos<T> extends TdaNodos<T> implements Cola<T> {

	private Nodo<T> last;

	public ColaNodos() {
		super();
	}
	
	public ColaNodos(int limite) {
		super(limite);
		this.last = null;
	}

	@Override
	public void add(T elemento) {
		checkFullness();
		Nodo<T> nuevoNodo = new Nodo<>(elemento);
		if (isEmpty()) {
			first = nuevoNodo;
		} else {
			last.next(nuevoNodo);
		}
		last = nuevoNodo;
		incrementSize();
	}

	@Override
	public T remove() {
		checkEmptiness();
		Nodo<T> aux = first;
		first = first.next();
		decrementSize();
		return aux.getElement();
	}

	@Override
	public T get() {
		checkEmptiness();
		return first.getElement();
	}

}