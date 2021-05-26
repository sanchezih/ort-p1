package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._03_sorteador_bingo;

import java.util.ArrayList;
import java.util.Random;

public class Bolillero {

	private ArrayList<String> elementos;
	private Random r;

	public Bolillero() {
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
