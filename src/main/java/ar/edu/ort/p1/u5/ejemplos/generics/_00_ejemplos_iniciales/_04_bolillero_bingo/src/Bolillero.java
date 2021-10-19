package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._04_bolillero_bingo.src;

import java.util.ArrayList;
import java.util.Random;

public class Bolillero<T> {

	private ArrayList<T> elementos;
	private Random r;
	private int capacidadMaxima;

	public Bolillero(int capacidadMaxima) {
		this.elementos = new ArrayList<T>();
		this.r = new Random();
		this.capacidadMaxima = capacidadMaxima;
	}

	public void add(T elemento) {
		if (this.elementos.size() < capacidadMaxima) {
			this.elementos.add(elemento);
		} else {
			throw new RuntimeException("No caben mas elementos");
		}
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public T remove() {
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return r.nextInt(this.elementos.size());
	}
}
