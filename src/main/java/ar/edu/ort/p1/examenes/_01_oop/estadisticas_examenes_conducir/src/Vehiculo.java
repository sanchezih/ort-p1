package ar.edu.ort.p1.examenes._01_oop.estadisticas_examenes_conducir.src;

public abstract class Vehiculo {

	private String patente;
	private String marca;
	private int cilindrada;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(String patente, String marca, int cilindrada) {
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}

	/*----------------------------------------------------------------------------*/

	public int getCilindrada() {
		return cilindrada;
	}

}
