package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public abstract class Auto extends Vehiculo {

	private boolean tieneAC;
	private TipoCombustible tipoCombustible;

	/**
	 * Ejercicio 1
	 * 
	 * @param id
	 * @param costoBaseKm
	 * @param tieneAC
	 * @param tipoCombustible
	 */
	public Auto(String id, double costoBaseKm, boolean tieneAC, TipoCombustible tipoCombustible) {
		super(id, costoBaseKm);
		this.tieneAC = tieneAC;
		this.tipoCombustible = tipoCombustible;
	}

	public boolean tieneAC() {
		return tieneAC;
	}

	public boolean esEcologico() {
		return this.tipoCombustible == TipoCombustible.ELECTRICO;
	}

}
