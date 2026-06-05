package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public enum AreasCarton {
	ALFA(5), CHARLIE(2), DELTA(1);

	private final int puntaje;

	private AreasCarton(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getPuntaje() {
		return puntaje;
	}
}
