package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._03_cola._01_impl_array.src;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear.TdaArray;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class ColaArray<T> extends TdaArray<T> implements Cola<T> {

	/*----------------------------------------------------------------------------*/

	public ColaArray(Class<T> tipo) {
		super(tipo);
	}

	public ColaArray(Class<T> tipo, int tope) {
		super(tipo, tope);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void add(T element) {
		checkFullness();
		array[currentSize] = element;
		incrementSize();
	}

	@Override
	public T remove() {
		checkEmptiness();
		T res = array[0];
		for (int i = 0; i < currentSize - 1; i++) {
			array[i] = array[i + 1];
		}
		decrementSize();
		array[currentSize] = null;
		achicarYPasar();
		return res;
	}

	@Override
	public T get() {
		checkEmptiness();
		return array[0];
	}

}