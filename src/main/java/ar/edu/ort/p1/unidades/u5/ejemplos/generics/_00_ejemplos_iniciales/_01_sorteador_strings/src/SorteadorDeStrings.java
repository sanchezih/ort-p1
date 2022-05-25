package ar.edu.ort.p1.unidades.u5.ejemplos.generics._00_ejemplos_iniciales._01_sorteador_strings.src;

import java.util.ArrayList;
import java.util.Random;

public class SorteadorDeStrings {

	private ArrayList<String> elementos;
	private Random random;

	// Constructor
	public SorteadorDeStrings() {
		this.elementos = new ArrayList<String>();
		this.random = new Random();
	}

	public void add(String elemento) {
		this.elementos.add(elemento);
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public String remove() {
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return random.nextInt(this.elementos.size());
	}
}
