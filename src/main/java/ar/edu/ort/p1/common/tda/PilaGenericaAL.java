package ar.edu.ort.p1.common.tda;

import java.util.ArrayList;
import edu.ort.tp1.u5.tda.Pila;

public class PilaGenericaAL<T> implements Pila<T> {
	private ArrayList<T> elementos = new ArrayList<T>();

	@Override
	public void push(T elemento) {
		elementos.add(elemento);
	}

	@Override
	public T pop() {
		return elementos.remove(elementos.size() - 1);
	}

	@Override
	public T peek() {
		return elementos.get(elementos.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
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
	}
}