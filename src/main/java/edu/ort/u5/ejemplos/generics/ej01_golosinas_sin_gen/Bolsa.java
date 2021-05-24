package edu.ort.u5.ejemplos.generics.ej01_golosinas_sin_gen;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {
	private ArrayList lista = new ArrayList();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	public Iterator iterator() {
		return lista.iterator();
	}
}