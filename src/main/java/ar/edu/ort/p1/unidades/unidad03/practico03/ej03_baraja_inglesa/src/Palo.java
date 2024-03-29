package ar.edu.ort.p1.unidades.unidad03.practico03.ej03_baraja_inglesa.src;

public enum Palo {
	CORAZON(Color.ROJO), //
	DIAMANTE(Color.ROJO), //
	PICA(Color.NEGRO), //
	TREBOL(Color.NEGRO);

	private Color color;

	private Palo(Color color) {
		this.color = color;
	}
}