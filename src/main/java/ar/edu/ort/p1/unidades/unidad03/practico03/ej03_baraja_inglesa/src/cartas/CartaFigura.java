package ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src.cartas;

import ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src.Palo;

public class CartaFigura extends CartaConPalo {

	private char letra;

	public CartaFigura(char letra, Palo palo) {
		super(palo);
		this.letra = letra;
	}

	@Override
	public String getRepresentacion() {
		return letra + super.getRepresentacion();
	}

}