package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.cola.impl_linkedlist;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src.SinglyLinkedList;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class ColaLinkedList<T> implements Cola<T> {

	private SinglyLinkedList<T> elementos;

	// Constructores
	public ColaLinkedList() {
		this.elementos = new SinglyLinkedList<T>();
	}

	// Metodos
	@Override
	public void add(T element) {
		checkFullness();
		elementos.addLast(element);
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
		System.out.println(this.elementos.toString());
	}

}