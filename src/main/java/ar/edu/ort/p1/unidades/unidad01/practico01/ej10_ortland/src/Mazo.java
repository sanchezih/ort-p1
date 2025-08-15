package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

import java.util.ArrayList;
import java.util.List;

public class Mazo {

	private List<Carta> cartas;

	/*----------------------------------------------------------------------------*/

	public Mazo() {
		this.cartas = new ArrayList<Carta>();
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getCantidadDeCartas() {
		return this.cartas.size();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public Carta getProximaCarta() {
		return this.cartas.remove(0);
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {
		final int CANT_CARTAS_X_PALO = 12;

		for (Palo palo : Palo.values()) {
			for (int i = 0; i < CANT_CARTAS_X_PALO; i++) {
				this.cartas.add(new Carta(i + 1, palo));
			}
		}
	}

}
