package ar.edu.ort.p1.unidades.u5.ejemplos.generics._00_ejemplos_iniciales._04_sorteador_generico;

import java.util.ArrayList;
import java.util.Random;

public class SorteadorGenerico<T> {

	private ArrayList<T> elementos;
	private Random random;

	// Constructor
	public SorteadorGenerico() {
		this.elementos = new ArrayList<T>();
		this.random = new Random();
	}

	public void add(T elemento) {
		this.elementos.add(elemento);
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public T remove() {
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return random.nextInt(this.elementos.size());
	}
}
