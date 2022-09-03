package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

public class Informe {

	private double porcReprobados;
	private double promTiempoAutosAprobados;

	public Informe(double porcReprobados, double promTiempoAutosAprobados) {
		this.porcReprobados = porcReprobados;
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	public String toString() {
		return "Informe [\n\tPorcentaje de reprobados = " + porcReprobados
				+ ", \n\tPromedio de tiempo de autos aprobados = " + promTiempoAutosAprobados + "\n]";
	}

}