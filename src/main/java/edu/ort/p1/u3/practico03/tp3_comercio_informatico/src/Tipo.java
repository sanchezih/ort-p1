package edu.ort.p1.u3.practico03.tp3_comercio_informatico.src;

public enum Tipo {
	PERIFERICO(5), LIMPIEZA(8), HARDWARE(11);

	private double porcGanancia;

	private Tipo(double porcGanancia) {
		this.porcGanancia = porcGanancia;
	}

	public double getPorcGanancia() {
		return porcGanancia;
	}

}
