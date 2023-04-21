package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

import java.util.ArrayList;

public class SedeDeLicencias {

	private ArrayList<Examen> examenes;

	/*----------------------------------------------------------------------------*/

	public SedeDeLicencias() {
		super();
		this.examenes = new ArrayList<Examen>();
	}

	/*----------------------------------------------------------------------------*/

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

	/**
	 * 
	 * @return
	 */
	private double porcentajeDeReprobados() {
		int cantidadDeReprobados = 0;
		int cantidadTotal = this.examenes.size();

		for (Examen examen : this.examenes) {
			if (!examen.isAprobado()) {
				cantidadDeReprobados++;
			}
		}
		// Casteo a double por la division entre enteros de Java que trunca decimales
		return (cantidadTotal > 0 ? (double) cantidadDeReprobados / cantidadTotal * 100 : 0);

	}

	/**
	 * 
	 * @return
	 */
	private double promTiempoAutosAprobados() {
		int acuTiempos = 0;
		int contTiempos = 0;

		for (Examen examen : this.examenes) {
			if (examen instanceof ExamenDeAuto && examen.isAprobado()) {
				acuTiempos += ((ExamenDeAuto) examen).getTiempo();
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
