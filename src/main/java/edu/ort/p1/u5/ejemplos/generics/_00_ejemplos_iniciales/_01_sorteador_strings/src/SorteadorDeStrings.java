package edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._01_sorteador_strings.src;

import java.util.ArrayList;
import java.util.Random;

public class SorteadorDeStrings {

	private ArrayList<String> elementos;
	private Random r;

	public SorteadorDeStrings() {
		this.elementos = new ArrayList<String>();
		this.r = new Random();
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
		return r.nextInt(this.elementos.size());
	}
}
