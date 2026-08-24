package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class Informe {

	private int maxCantAprobadas;
	private List<AlumnoSimplificado> alumnos;

	/*----------------------------------------------------------------------------*/

	public Informe(int maxCantAprobadas) {
		this.maxCantAprobadas = maxCantAprobadas;
		this.alumnos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void addAlumnoSimplificado(AlumnoSimplificado alumnoSimplificado) {
		this.alumnos.add(alumnoSimplificado);
	}

	@Override
	public String toString() {
		return "Informe {\n\tMaximo nro de materias aprobadas por un alumno: " + maxCantAprobadas + "\n\talumnos="
				+ alumnos + "\n}";
	}

}
