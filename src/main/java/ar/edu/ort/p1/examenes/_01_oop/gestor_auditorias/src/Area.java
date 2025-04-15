package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

import java.util.ArrayList;
import java.util.List;

public class Area {

	private String nombre;
	private int cantEmpleados;
	private Empleado responsable;
	private List<Observacion> observaciones;

	/*----------------------------------------------------------------------------*/

	public Area(String nombre, int cantEmpleados, Empleado responsable) {
		this.nombre = nombre;
		this.cantEmpleados = cantEmpleados;
		this.responsable = responsable;
		this.observaciones = new ArrayList<Observacion>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo obtenerCantObservacionesExternas() que tiene un area.
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
	 * Ejercicio D: El metodo obtenerObservacionesVencidas() que debera devolver, no
	 * mostrar por consola, la lista de observaciones que estan vencidas en un area
	 * en particular.
	 * 
	 * @return
	 */
	public List<Observacion> obtenerObservacionesVencidas() {
		List<Observacion> observacionesVencidas = new ArrayList<Observacion>();
		
		for (Observacion observacion : observaciones) {
			if (observacion.estaVencida()) {
				observacionesVencidas.add(observacion);
			}
		}
		return observacionesVencidas;
	}

	/**
	 * Ejercicio F: El metodo mostrarObservacionesCriticas() que muestre por consola
	 * el titulo, descripcion y el nombre, apellido y legajo del auditor de las
	 * observaciones en un area en particular cuyo nivel de criticidad de su
	 * elemento auditable sea mayor a 1.
	 */
	public void mostrarObservacionesCriticas() {
		for (Observacion observacion : observaciones) {
			if (observacion.esCritica()) {
				observacion.mostrar();
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarObservacion(Observacion observacion) {
		this.observaciones.add(observacion);
	}

}
