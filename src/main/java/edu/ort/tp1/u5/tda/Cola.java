package edu.ort.tp1.u5.tda;

public interface Cola<T> extends Tda {

	void add(T element);

	T remove();

	T get();

}