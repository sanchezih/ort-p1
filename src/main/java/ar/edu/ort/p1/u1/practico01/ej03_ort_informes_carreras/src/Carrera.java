package ar.edu.ort.p1.u1.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Alumno> alumnos;

	public Carrera() {
		this.alumnos = new ArrayList<Alumno>();
	}

	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo getInformeMaxMaterias de la clase
	 * Carrera, que debe crear y devolver un unico que contenga como datos: I.
	 * Cantidad de materias aprobadas II. Lista con unicamente los nombres y mails
	 * de todos aquellos alumnos que sean quienes mas materias tienen aprobadas.
	 * 
	 * @return
	 */
	public Informe getInformeMaxMaterias() {
		Informe informe;
		int maxCantAprobadas;

		maxCantAprobadas = maxCantMateriasAprobadas();
		informe = new Informe(maxCantAprobadas);

		for (Alumno a : this.alumnos) {
			if (a.cantAprobadas() == maxCantAprobadas) {
				AlumnoSimplificado as = new AlumnoSimplificado(a.getNombre(), a.getMail());
				informe.agregarAlumnoSimplificado(as);
			}
		}
		return informe;
	}

	private int maxCantMateriasAprobadas() {
		int max = 0;
		int cantAprobadas;

		for (Alumno a : this.alumnos) {
			cantAprobadas = a.cantAprobadas();
			if (cantAprobadas > max) {
				max = cantAprobadas;
			}
		}
		return max;
	}
	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void mostrarInformeMaxMaterias() {
		Informe informe = this.getInformeMaxMaterias();
		System.out.println(informe.toString());
	}
}
