package edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._03_sorteador_generico;

import java.util.ArrayList;
import java.util.Random;

public class SorteadorGenerico<T> {

	private ArrayList<T> elementos;
	private Random r;

	public SorteadorGenerico() {
		this.elementos = new ArrayList<T>();
		this.r = new Random();
	}

	public void add(T elemento) {
		this.elementos.add(elemento);
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public Object remove() {
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return r.nextInt(this.elementos.size());
	}
}
