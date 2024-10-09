package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._01_linkedlist;

import ar.edu.ort.tp1.u5.tda.interfaces.Tda;

public interface LinkedList<T> extends Tda {
	int getCantidadElementos();

	void addFirst(T elemento);

	void addLast(T elemento);

	T getFirst();

	T getLast();

	T removeFirst();

	T removeLast();

	void addAt(T elemento, int posicion);

	void rotar();

	void printForward();
}