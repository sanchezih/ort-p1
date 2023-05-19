package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._03_cola._03_impl_linkedlist;

import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._01_linkedlist._01_simplemente_enlazada.src.ListaSimplementeEnlazada;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class ColaLinkedList<T> implements Cola<T> {

	private ListaSimplementeEnlazada<T> elementos;

	/*----------------------------------------------------------------------------*/

	public ColaLinkedList() {
		this.elementos = new ListaSimplementeEnlazada<T>();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void add(T elemento) {
		checkFullness();
		elementos.addLast(elemento);
	}

	@Override
	public T remove() {
		checkEmptiness();
		return elementos.removeFirst();
	}

	@Override
	public T get() {
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
		this.elementos.printForward();
	}

	public void mostrarTitulo() {
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|             COLA IMPLEMENTADA CON UNA LISTA SIMPLEMENTE ENLAZADA             |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();
	}

}