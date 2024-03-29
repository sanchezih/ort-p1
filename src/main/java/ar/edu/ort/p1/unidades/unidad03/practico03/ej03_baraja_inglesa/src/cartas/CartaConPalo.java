package ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src.cartas;

import ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src.Palo;

public abstract class CartaConPalo extends Carta {

	private Palo palo;

	public CartaConPalo(Palo palo) {
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	@Override
	public String getRepresentacion() {
		return " de " + palo;
	}

}