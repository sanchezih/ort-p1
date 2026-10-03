package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public abstract class Vehiculo {

	private String id;
	private double costoBasePorKm;

	public Vehiculo(String id, double costoBasePorKm) {
		this.id = id;
		this.costoBasePorKm = costoBasePorKm;
	}

	public double getCostoBasePorKm() {
		return costoBasePorKm;
	}

	public abstract double getAdicional();
}
