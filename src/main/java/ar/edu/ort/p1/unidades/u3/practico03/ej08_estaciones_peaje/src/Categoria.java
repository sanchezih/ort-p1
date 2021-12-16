package ar.edu.ort.p1.unidades.u3.practico03.ej08_estaciones_peaje.src;

public enum Categoria {

	AUTO(100), MOTO(50), CAMION(200);

	private double tarifa;

	Categoria(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarifa() {
		return tarifa;
	}

}