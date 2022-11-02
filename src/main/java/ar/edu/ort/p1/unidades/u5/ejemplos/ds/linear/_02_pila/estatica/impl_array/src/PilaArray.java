package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._02_pila.estatica.impl_array.src;

import java.lang.reflect.Array;

import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class PilaArray<T> implements Pila<T> {

	private T pila[] = null;
	private int currentSize;

	/* Constructores */

	public PilaArray(Class<T> tipo, int limite) {
		this.currentSize = 0;
		pila = (T[]) Array.newInstance(tipo, limite);
		System.out.println("Se creo una pila de tamanio: " + limite);
	}

	/* Metodos */

	@Override
	public void push(T elemento) {
		checkFullness();
		pila[currentSize] = elemento;
		currentSize++;
		System.out.println("Se inserto el elemento: " + elemento);
	}

	@Override
	public T pop() {
		T res = null;
		checkEmptiness();
		res = pila[currentSize - 1];
		currentSize--;
		return res;
	}

	@Override
	public T peek() {
		checkEmptiness();
		return pila[currentSize - 1];
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public boolean isFull() {
		return currentSize == pila.length ? true : false;
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
}