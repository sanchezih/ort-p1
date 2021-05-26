package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._01_ejemplo_urna;

import java.util.ArrayList;

public class Urna<E> {

	private ArrayList<E> elementos;

	public Urna() {
		elementos = new ArrayList<>();
	}

	public E remove() {
		E elemento = null;
		if (!isEmpty()) {
			int pos = (int) (Math.random() * elementos.size());
			elemento = elementos.remove(pos);
		}
		return elemento;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void add(E objeto) {
		elementos.add(objeto);
	}

}
