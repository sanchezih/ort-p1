package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_linkedlist.src;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src.ListaSimplementeEnlazada;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class PilaLinkedList<T> implements Pila<T> {

	private ListaSimplementeEnlazada<T> elementos;

	// Constructores
	public PilaLinkedList() {
		this.elementos = new ListaSimplementeEnlazada<T>();
	}

	public PilaLinkedList(int tamanio) {
		this.elementos = new ListaSimplementeEnlazada<T>(tamanio);
	}

	// Metodos
	@Override
	public void push(T elemento) {
		checkFullness();
		elementos.addFirst(elemento);
	}

	@Override
	public T pop() {
		checkEmptiness();
		return elementos.removeFirst();
	}

	@Override
	public T peek() {
		checkEmptiness();
		return elementos.getFirst();
	}

	@Override
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public boolean isFull() {
		return elementos.isFull();
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
		if (isFull()) {
			throw new RuntimeException(
					String.format(ERR_ESTRUCTURA_LLENA, this.getClass().getInterfaces()[0].getSimpleName()));
		}
	}

	public void mostrar() {
		System.out.println(this.elementos.toString());
	}
}