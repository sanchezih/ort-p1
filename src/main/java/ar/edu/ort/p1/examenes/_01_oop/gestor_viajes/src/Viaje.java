package ar.edu.ort.p1.examenes._01_oop.gestor_viajes.src;

public class Viaje {

	private double km;
	private Vehiculo vehiculo;

	public Viaje(double km, Vehiculo vehiculo) {
		this.km = km;
		this.vehiculo = vehiculo;
	}

	public double getCosto() {
		double costoBase = this.km * this.vehiculo.getCostoBasePorKm();
		double costo = costoBase + vehiculo.getAdicional();
		return costo;
	}

	public boolean esViajePremium() {
		return this.vehiculo instanceof AutoPremium;
	}

	public boolean esEnVehiculoConAC() {
		boolean tieneAC = false;
		Auto unAuto = null;
		if (this.vehiculo instanceof Auto) {
			unAuto = (Auto) this.vehiculo;
			tieneAC = unAuto.tieneAC();
		}
		return tieneAC;
	}

	/**
	 * Ejercicio 5: Metodo de la clase Cliente que indica si realizo al menos un
	 * viaje utilizando un vehiculo que utilice combustible del tipo Electrico.
	 */
	public boolean esEnVehiculoEcologico() {
		boolean esEcologico = false;
		Auto unAuto = null;

		if (this.vehiculo instanceof Auto) {
			unAuto = (Auto) this.vehiculo;
			esEcologico = unAuto.esEcologico();
		}
		return esEcologico;
	}

}
