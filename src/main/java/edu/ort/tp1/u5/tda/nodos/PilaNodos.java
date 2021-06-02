package edu.ort.tp1.u5.tda.nodos;

import edu.ort.tp1.u5.tda.Pila;

public class PilaNodos<T> extends TdaNodos<T> implements Pila<T> {

	public PilaNodos() {
		super();
	}

	public PilaNodos(int tope) {
		super(tope);
	}

	@Override
	public T peek() {
		checkEmptiness();
		return first.getElement();
	}

	@Override
	public T pop() {
		checkEmptiness();
		Nodo<T> aux = first;
		first = first.next();
		decrementSize();
		return aux.getElement();
	}

	@Override
	public void push(T elemento) {
		checkFullness();
		Nodo<T> nuevoNodo = new Nodo<>(elemento);
		nuevoNodo.next(first);
		first = nuevoNodo;
		incrementSize();
	}

}