package ar.edu.ort.p1.unidades.u4.practico04.ej02_baraja_espaniola.src;

import java.util.Random;

public class Baraja {
	private static final int CANT_CARTAS = 48;
	private Carta[] cartas = new Carta[CANT_CARTAS];

	public Baraja() {
		inicializarBaraja();
	}

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

	private void inicializarBaraja() {
		int i = 0;
		for (Palo p : Palo.values()) {
			for (int j = 0; j < 12; j++) {
				cartas[i] = new Carta(j + 1, p);
				i++;
			}
		}
		mezclarBaraja();
	}

	private void mezclarBaraja() {
		Random random = new Random();
		for (int i = 0; i < cartas.length; i++) {
			int randomIndexToSwap = random.nextInt(cartas.length);
			Carta temp = cartas[randomIndexToSwap];
			cartas[randomIndexToSwap] = cartas[i];
			cartas[i] = temp;
		}
	}
}
