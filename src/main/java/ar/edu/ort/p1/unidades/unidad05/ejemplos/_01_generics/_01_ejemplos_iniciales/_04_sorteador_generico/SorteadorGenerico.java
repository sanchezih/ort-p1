package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._01_ejemplos_iniciales._04_sorteador_generico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteadorGenerico<T> {

	private List<T> elementos;
	private Random random;

	/*----------------------------------------------------------------------------*/

	public SorteadorGenerico() {
		this.elementos = new ArrayList<>();
		this.random = new Random();
	}

	/*----------------------------------------------------------------------------*/

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

	public void isVacio() {
		System.out.println("El sorteador esta vacio? -> " + this.isEmpty());
	}
}
