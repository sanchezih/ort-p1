package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._01_ejemplos_iniciales._03_sorteador_objects;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author ihsanch
 *
 */
public class SorteadorDeObjects {

	private ArrayList<Object> elementos;
	private Random random;

	/*----------------------------------------------------------------------------*/

	public SorteadorDeObjects() {
		this.elementos = new ArrayList<Object>();
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
		return this.elementos.remove(posRandom());
	}

	private int posRandom() {
		return random.nextInt(this.elementos.size());
	}

	public void isVacio() {
		System.out.println("El sorteador esta vacio? -> " + this.isEmpty());
	}
}
