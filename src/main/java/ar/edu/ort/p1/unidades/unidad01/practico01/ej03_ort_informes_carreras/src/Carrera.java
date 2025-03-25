package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

	private List<Alumno> alumnos;

	/*----------------------------------------------------------------------------*/

	public Carrera() {
		this.alumnos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo getInformeMaxMaterias de la clase
	 * Carrera, que debe crear y devolver un unico objeto que contenga como datos:
	 * 
	 * I. Cantidad de materias aprobadas.
	 * 
	 * II. Lista con unicamente los nombres y mails de todos aquellos alumnos que
	 * sean quienes mas materias tienen aprobadas.
	 * 
	 * @return
	 */
	public Informe getInformeMaxMaterias() {

		int maxCantAprobadas = getMaxCantMateriasAprobadas();
		Informe informe = new Informe(maxCantAprobadas);

		for (Alumno alumno : this.alumnos) {
			if (alumno.getCantMateriasAprobadas() == maxCantAprobadas) {
				AlumnoSimplificado alumnoSimplificado = new AlumnoSimplificado(alumno.getNombre(), alumno.getMail());
				informe.addAlumnoSimplificado(alumnoSimplificado);
			}
		}
		return informe;
	}

	/**
	 * 
	 * @return
	 */
	private int getMaxCantMateriasAprobadas() {
		int max = 0;
		int cantAprobadas = -1;

		for (Alumno alumno : this.alumnos) {
			cantAprobadas = alumno.getCantMateriasAprobadas();
			if (cantAprobadas > max) {
				max = cantAprobadas;
			}
		}
		return max;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostrarInformeMaxMaterias() {
		Informe informe = this.getInformeMaxMaterias();
		System.out.println(informe.toString());
	}
}
