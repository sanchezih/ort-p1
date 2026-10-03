package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public class Moto extends Vehiculo {

	private static final double ADICIONAL_SIN_CASCO = -1000.0;
	private boolean incluyeCasco;

	/**
	 * Ejercicio 1
	 * 
	 * @param id
	 * @param costoBaseKm
	 * @param incluyeCasco
	 */
	public Moto(String id, double costoBaseKm, boolean incluyeCasco) {
		super(id, costoBaseKm);
		this.incluyeCasco = incluyeCasco;
	}

	@Override
	public double getAdicional() {
		return !this.incluyeCasco ? ADICIONAL_SIN_CASCO : 0.0;
	}

}
