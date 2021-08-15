package ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src;

public enum CategoriaVehiculo {
	AUTO(100), MOTO(50), CAMION(200);

	private double tarifaBase;

	CategoriaVehiculo(double tb) {
		tarifaBase = tb;
	}

	public double getTarifaBase() {
		return tarifaBase;
	}

	public void setTarifaBase(double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}

}