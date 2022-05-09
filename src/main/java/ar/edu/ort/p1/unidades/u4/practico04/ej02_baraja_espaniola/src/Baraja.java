package ar.edu.ort.p1.unidades.u4.practico04.ej02_baraja_espaniola.src;

import java.util.Random;

public class Baraja {

	private static final int CANT_CARTAS = 48;
	private Carta[] cartas = new Carta[CANT_CARTAS];

	public Baraja() {
		inicializarBaraja();
	}

	/**
	 * Dada una baraja de cartas espaniolas sin comodines, de las que se sabe, de
	 * cada una, su numero y palo, desarrollar el metodo estaOrdenada en la clase
	 * Baraja que permita retornar si las cartas se encuentran ordenadas tal como se
	 * ilustra en la figura.
	 * 
	 * Ayuda: Recorda que los palos se pueden enumerar. Los enumerados tienen
	 * metodos utiles que podran ayudarte a resolver el problema.
	 * 
	 * https://www.youtube.com/watch?v=-Q1f3eCPsfY
	 * 
	 * @return
	 */
	public boolean estaOrdenada() {
		boolean estaOrdenada = true;
		int idxPalo = 0;
		Palo[] palos;

		palos = Palo.values();
		while (idxPalo < palos.length && estaOrdenada) {
			estaOrdenada = estaOrdenada(palos[idxPalo]);
			idxPalo++;
		}
		return estaOrdenada;
	}

	private boolean estaOrdenada(Palo palo) {
		boolean estaOrdenada = true;
		int i = 0;
		Carta c;

		while (i < Carta.MAX_NUM && estaOrdenada) {
			c = this.cartas[Carta.MAX_NUM * palo.ordinal() + i];
			estaOrdenada = c.getNumero() == (i + 1) && c.esDe(palo);
			i++;
		}
		return estaOrdenada;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarBaraja() {
		int i = 0;
		for (Palo p : Palo.values()) {
			for (int j = 0; j < 12; j++) {
				cartas[i] = new Carta(j + 1, p);
				i++;
			}
		}
	}

	public void mezclarBaraja() {
		Random random = new Random();
		for (int i = 0; i < cartas.length; i++) {
			int randomIndexToSwap = random.nextInt(cartas.length);
			Carta temp = cartas[randomIndexToSwap];
			cartas[randomIndexToSwap] = cartas[i];
			cartas[i] = temp;
		}
	}
}
