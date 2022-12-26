package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._02_pila._01_impl_array.src;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.TdaArray;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class PilaArray<T> extends TdaArray<T> implements Pila<T> {

	/*----------------------------------------------------------------------------*/

	public PilaArray(Class<T> tipo) {
		super(tipo);
	}

	public PilaArray(Class<T> tipo, int tope) {
		super(tipo, tope);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void push(T element) {
		checkFullness();
		array[currentSize] = element;
		incrementSize();
	}

	@Override
	public T pop() {
		checkEmptiness();
		T element = array[currentSize - 1];
		array[currentSize - 1] = null;
		decrementSize();
		achicarYPasar();
		return element;

	}

	@Override
	public T peek() {
		checkEmptiness();
		return array[currentSize - 1];
	}
}