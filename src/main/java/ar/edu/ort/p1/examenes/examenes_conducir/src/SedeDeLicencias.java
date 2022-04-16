package ar.edu.ort.p1.examenes.examenes_conducir.src;

import java.util.ArrayList;

public class SedeDeLicencias {

	private ArrayList<Examen> examenes;

	public SedeDeLicencias() {
		super();
		this.examenes = new ArrayList<Examen>();
	}

	/**
	 * Ejercicio B: El metodo obtenerInforme() que debe devolver (no mostrar por
	 * consola) los siguientes datos:
	 * 
	 * Porcentaje de examenes reprobados.
	 * 
	 * Promedio de tiempo de los examenes de auto aprobados.
	 * 
	 * @return
	 */
	public Informe obtenerInforme() {
		double porcReprobados = porcentajeDeReprobados();
		double prom = promTiempoAutosAprobados();
		return new Informe(porcReprobados, prom);

	}

	private double porcentajeDeReprobados() {
		int cantR = 0;
		int cantTotal = this.examenes.size();

		for (Examen e : this.examenes) {
			if (!e.isAprobado()) {
				cantR++;
			}
		}
		// Casteo a double por la division entre enteros de Java que trunca decimales
		return (cantTotal > 0 ? (double) cantR / cantTotal * 100 : 0);

	}

	private double promTiempoAutosAprobados() {
		int acuTiempos = 0;
		int contTiempos = 0;

		for (Examen e : this.examenes) {
			if (e instanceof ExamenDeAuto && e.isAprobado()) {
				acuTiempos += ((ExamenDeAuto) e).getTiempo();
				contTiempos++;
			}
		}
		// Casteo a double por la division entre enteros de Java que trunca decimales
		return (contTiempos > 0 ? (double) acuTiempos / contTiempos : 0);
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complemetarios

	public void agregarExamen(Examen examen) {
		this.examenes.add(examen);
	}

}
