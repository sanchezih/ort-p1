package ar.edu.ort.p1.u1.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;

public class Informe {

	private int cant;
	private ArrayList<AlumnoSimplificado> alumnos;

	public Informe(int maxCantAprobadas) {
		this.cant = maxCantAprobadas;
		this.alumnos = new ArrayList<AlumnoSimplificado>();
	}

	public void agregarAlumnoSimplificado(AlumnoSimplificado as) {
		this.alumnos.add(as);
	}

	@Override
	public String toString() {
		return "Informe [cant=" + cant + ", alumnos=" + alumnos + "]";
	}

}
