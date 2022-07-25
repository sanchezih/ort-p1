package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_linkedlist_generic.src;

import ar.edu.ort.tp1.u5.tda.Pila;
import ar.edu.ort.tp1.u5.tda.nodos.Nodo;

public class PilaGenericaListaEnlazada<T> implements Pila<T> {

	private Nodo<T> end;
	private int tamanio;

	public PilaGenericaListaEnlazada() {
		end = null;
		tamanio = 0;
	}

	@Override
	public boolean isEmpty() {
		return (tamanio == 0);
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
	public void push(T element) {
		Nodo<T> nuevoNodo = new Nodo<T>(element);
		if (end == null)
			end = nuevoNodo;
		else {
			nuevoNodo.next(end);
			end = nuevoNodo;
		}
		tamanio++;

	}

	@Override
	public T pop() {
		T elemento = null;

		if (end != null) {
			elemento = end.getElement();
			end = end.next();
			tamanio--;
		}
		return elemento;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		return tamanio;
	}

	public T end() {
		T res = null;
		if (end != null) {
			res = end.getElement();
		}
		return res;
	}

}