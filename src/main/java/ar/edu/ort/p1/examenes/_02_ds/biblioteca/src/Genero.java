package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public enum Genero {
	AVENTURAS(22), //
	MISTERIO(35);

	private int edadMinima;

	private Genero(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

}
