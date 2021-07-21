package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._02_sorteador_objects;

import java.util.ArrayList;
import java.util.Random;

public class SorteadorDeObjects {

	private ArrayList<Object> elementos;
	private Random r;

	public SorteadorDeObjects() {
		this.elementos = new ArrayList<Object>();
		this.r = new Random();
	}

	public void add(Object elemento) {
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
