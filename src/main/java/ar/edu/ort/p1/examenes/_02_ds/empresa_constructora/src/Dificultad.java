package ar.edu.ort.p1.examenes._02_ds.empresa_constructora.src;

public enum Dificultad {

	BAJO(1), MEDIO(3), ALTO(6);

	private int indice;

	private Dificultad(int indice) {
		this.indice = indice;
	}

	public int getIndice() {
		return indice;
	}
}
