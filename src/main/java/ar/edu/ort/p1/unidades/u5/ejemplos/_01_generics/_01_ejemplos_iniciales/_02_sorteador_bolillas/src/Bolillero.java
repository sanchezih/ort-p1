package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._01_ejemplos_iniciales._02_sorteador_bolillas.src;

import java.util.ArrayList;
import java.util.Random;

public class Bolillero {

	private ArrayList<Bolilla> elementos;
	private Random random;
	private int capacidadMaxima;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param capacidadMaxima
	 */
	public Bolillero(int capacidadMaxima) {
		this.elementos = new ArrayList<Bolilla>();
		this.random = new Random();
		this.capacidadMaxima = capacidadMaxima;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param elemento
	 */
	public void add(Bolilla elemento) {
		if (this.elementos.size() < capacidadMaxima) {
			this.elementos.add(elemento);
		} else {
			throw new RuntimeException("No caben mas elementos");
		}
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public Bolilla remove() {
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return random.nextInt(this.elementos.size());
	}
}
