package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._01_ejemplos_iniciales._01_sorteador_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteadorDeStrings {

	private List<String> elementos;
	private Random random;

	/*----------------------------------------------------------------------------*/

	public SorteadorDeStrings() {
		this.elementos = new ArrayList<>();
		this.random = new Random();
	}

	/*----------------------------------------------------------------------------*/

	public void add(String elemento) {
		this.elementos.add(elemento);
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public String remove() {
		return this.elementos.remove(getPosicionRandom());
	}

	private int getPosicionRandom() {
		return this.random.nextInt(this.elementos.size());
	}
}
