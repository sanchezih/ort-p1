package ar.edu.ort.p1.extra.examenes._2021c2._1p_gestionauditorias.tema1.src;

import java.util.ArrayList;

public class Area {

	private String nombre;
	private int cantEmpleados;
	private Empleado responsable;
	private ArrayList<Observacion> observaciones;

	/**
	 * Tema 1 - Ejercicio B: El metodo obtenerCantObservacionesExternas() que tiene
	 * un area.
	 * 
	 * @return
	 */
	public int obtenerCantObservacionesExternas() {
		int cantidad = 0;
		for (Observacion observacion : observaciones) {
			if (observacion instanceof ObservacionExterna) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/**
	 * Tema 1 - Ejercicio D: El metodo mostrarObservacionesCriticas() que muestre
	 * por consola el titulo, descripcion y el nombre, apellido y legajo del auditor
	 * de las observaciones en un area en particular cuyo nivel de criticidad de su
	 * elemento auditable sea mayor a 1.
	 */
	public void mostrarObservacionesCriticas() {
		for (Observacion observacion : observaciones) {
			if (observacion.esCritica()) {
				observacion.mostrar();
			}
		}
	}

	/**
	 * Tema 2 - Ejercicio B: El metodo obtenerCantObservacionesInternas() que tiene
	 * un area.
	 * 
	 * @return
	 */
	public int obtenerCantObservacionesInternas() {
		int cantidad = 0;
		for (Observacion observacion : observaciones) {
			if (observacion instanceof ObservacionInterna) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/**
	 * Tema 2 - Ejercicio D: El metodo obtenerObservacionesVencidas() que debera
	 * devolver, no mostrar por consola, la lista de observaciones que estan
	 * vencidas en un area en particular.
	 * 
	 * @return
	 */
	public ArrayList<Observacion> obtenerObservacionesVencidas() {
		ArrayList<Observacion> observacionesVencidas = new ArrayList<Observacion>();
		for (Observacion observacion : observaciones) {
			if (observacion.estaVencida()) {
				observacionesVencidas.add(observacion);
			}
		}
		return observacionesVencidas;
	}
}
