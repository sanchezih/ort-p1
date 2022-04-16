package ar.edu.ort.p1.examenes.examenes_conducir.src;

public class Informe {

	private double porcReprobados;
	private double promTiempoAutosAprobados;

	public Informe(double porcReprobados, double promTiempoAutosAprobados) {
		this.porcReprobados = porcReprobados;
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	public double getPorcReprobados() {
		return porcReprobados;
	}

	public void setPorcReprobados(double porcReprobados) {
		this.porcReprobados = porcReprobados;
	}

	public double getPromTiempoAutosAprobados() {
		return promTiempoAutosAprobados;
	}

	public void setPromTiempoAutosAprobados(double promTiempoAutosAprobados) {
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	@Override
	public String toString() {
		return "Informe [\n\tPorcentaje de reprobados = " + porcReprobados + ", \n\tPromedio de tiempo de autos aprobados = "
				+ promTiempoAutosAprobados + "\n]";
	}

}