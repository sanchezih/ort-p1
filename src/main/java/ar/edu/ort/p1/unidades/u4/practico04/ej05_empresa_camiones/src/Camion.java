package ar.edu.ort.p1.unidades.u4.practico04.ej05_empresa_camiones.src;

public class Camion {

	private int id;
	private double costoPorKm;

	public Camion(int id, double costoPorKm) {
		this.id = id;
		this.costoPorKm = costoPorKm;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

}
