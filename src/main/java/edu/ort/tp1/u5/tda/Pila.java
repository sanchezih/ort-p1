package edu.ort.tp1.u5.tda;

public interface Pila<T> extends Tda {

	void push(T element);

	T pop();

	T peek();

}