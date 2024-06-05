package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._01_ejemplos_iniciales._03_sorteador_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author ihsanch
 *
 */
public class SorteadorDeObjects {

	private List<Object> elementos;
	private Random random;

	/*----------------------------------------------------------------------------*/

	public SorteadorDeObjects() {
		this.elementos = new ArrayList<>();
		this.random = new Random();
	}

	/*----------------------------------------------------------------------------*/

	public void add(Object elemento) {
		this.elementos.add(elemento);
	}

	public boolean isEmpty() {
		return this.elementos.isEmpty();
	}

	public Object remove() {
		return this.elementos.remove(getPosicionRandom());
	}

	private int getPosicionRandom() {
		return random.nextInt(this.elementos.size());
	}

	public void isVacio() {
		System.out.println("El sorteador esta vacio? -> " + this.isEmpty());
	}
}
