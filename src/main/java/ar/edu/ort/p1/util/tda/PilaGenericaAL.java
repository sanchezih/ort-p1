package ar.edu.ort.p1.util.tda;

import java.util.ArrayList;

import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class PilaGenericaAL<T> implements Pila<T> {
	private ArrayList<T> elementos = new ArrayList<T>();

	@Override
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub

	}

	@Override
	public void push(T element) {
		elementos.add(element);
	}

	@Override
	public T pop() {
		return elementos.remove(elementos.size() - 1);
	}

	@Override
	public T peek() {
		return elementos.get(elementos.size() - 1);
	}

}