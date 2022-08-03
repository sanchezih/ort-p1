package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist;

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

	void print();

}