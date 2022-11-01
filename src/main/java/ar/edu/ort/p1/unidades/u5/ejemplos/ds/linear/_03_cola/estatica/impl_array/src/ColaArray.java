package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._03_cola.estatica.impl_array.src;

import java.lang.reflect.Array;

import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class ColaArray<T> implements Cola<T> {

	private T cola[];
	private int currentSize;
	private int front;

	// Constructores
	public ColaArray(Class<T> tipo, int limite) {
		this.currentSize = 0;
		this.cola = (T[]) Array.newInstance(tipo, limite);
		System.out.println("Se creo una cola de tamanio: " + limite);
	}

	@Override
	public void add(T elemento) {
		checkFullness();
		cola[currentSize] = elemento;
		currentSize++;
	}

	@Override
	public T remove() {
		checkEmptiness();
		T res = cola[0];
		for (int i = 0; i < currentSize - 1; i++) {
			cola[i] = cola[i + 1];
		}
		cola[currentSize] = null;
		currentSize--;
		return res;
	}

	@Override
	public T get() {
		checkEmptiness();
		return cola[0];
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public boolean isFull() {
		return currentSize == cola.length ? true : false;
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
		checkEmptiness();
		int i;
		for (i = front; i < currentSize; i++) {
			System.out.print(" <- " + cola[i]);
		}
		System.out.println();
		return;
	}

	public void mostrarTitulo() {
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                        COLA IMPLEMENTADA CON UN ARRAY                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();
	}

}
