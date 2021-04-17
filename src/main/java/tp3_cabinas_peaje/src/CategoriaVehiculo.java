package tp3_cabinas_peaje.src;

public enum CategoriaVehiculo {
	AUTO(100), MOTO(50), CAMION(200);

	double tarifaBase;

	CategoriaVehiculo(double tb) {
		tarifaBase = tb;
	}

}