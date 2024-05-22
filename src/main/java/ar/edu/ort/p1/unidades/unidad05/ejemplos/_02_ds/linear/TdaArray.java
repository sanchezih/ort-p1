package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear;

import java.lang.reflect.Array;

import ar.edu.ort.tp1.u5.tda.interfaces.Tda;

public class TdaArray<T> implements Tda {

	private final static int INCREMENTO = 3;
	protected T array[] = null;

	private int maxSize;
	protected int currentSize;
	private boolean isIlimitado = false;
	private Class<T> tipo = null;
	private int multiplicador = 1;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param tipo
	 */
	protected TdaArray(Class<T> tipo) {
		this(tipo, SIN_LIMITE);
	}

	/**
	 * 
	 * @param tipo
	 * @param limite
	 */
	protected TdaArray(Class<T> tipo, int limite) {

		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_ILEGAL);
		}

		if (limite == -1) {
			isIlimitado = true;
			setMaxSize();
		} else {
			this.maxSize = limite;
		}
		
		this.tipo = tipo;
		this.array = (T[]) Array.newInstance(this.tipo, this.maxSize);
		this.currentSize = 0;
	}

	/*----------------------------------------------------------------------------*/

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
			if (!isIlimitado) {
				throw new RuntimeException(
						String.format(ERR_ESTRUCTURA_LLENA, this.getClass().getInterfaces()[0].getSimpleName()));
			} else {
				agrandarYPasar();
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	@Override
	public boolean isFull() {
		return currentSize == maxSize;
	}

	protected void incrementSize() {
		currentSize++;
	}

	protected void decrementSize() {
		currentSize--;
	}

	protected int getCurrentSize() {
		return this.currentSize;
	}

	/**
	 * 
	 */
	private void setMaxSize() {
		this.maxSize = this.multiplicador * INCREMENTO;
	}

	/**
	 * 
	 */
	private void agrandarYPasar() {
		this.multiplicador++;
		setMaxSize();
		T[] vectorNuevo = (T[]) Array.newInstance(this.tipo, this.maxSize);
		for (int i = 0; i <= this.array.length - 1; i++) {
			vectorNuevo[i] = this.array[i];
		}
		this.array = vectorNuevo;
	}

	/**
	 * 
	 */
	protected void achicarYPasar() {
		int posicion = (this.multiplicador - 1) * INCREMENTO;
		if (posicion > 0 && this.array[posicion] == null) {
			this.multiplicador--;
			setMaxSize();
			T[] vectorNuevo = (T[]) Array.newInstance(this.tipo, this.maxSize);
			for (int i = 0; i <= this.maxSize - 1; i++) {
				vectorNuevo[i] = this.array[i];
			}
			this.array = vectorNuevo;
		}
	}
}
