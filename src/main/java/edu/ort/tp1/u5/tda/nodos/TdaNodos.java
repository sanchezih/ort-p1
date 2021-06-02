package edu.ort.tp1.u5.tda.nodos;

import edu.ort.tp1.u5.tda.Tda;

public class TdaNodos<T> implements Tda {

	protected Nodo<T> first;
	private int limite;
	private int currentSize;

	protected TdaNodos() {
		this(SIN_LIMITE);
	}

	protected TdaNodos(int limite) {
		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_ILEGAL);
		}
		this.limite = limite;
		first = null;
		currentSize = 0;
	}

	protected void incrementSize() {
		currentSize++;
	}

	protected void decrementSize() {
		currentSize--;
	}
	
	protected int getCurrentSize() {
		return currentSize;
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

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public boolean isFull() {
		return currentSize == limite;
	}

}
