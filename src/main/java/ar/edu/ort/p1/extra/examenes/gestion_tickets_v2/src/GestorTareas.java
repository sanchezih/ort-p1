package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

import java.util.ArrayList;

public class GestorTareas {

	private ListaTicketsOrdenadoasPorPrioridad ticketsSinAsignar;
	private ArrayList<Empleado> usuarios;

	public GestorTareas() {
		this.ticketsSinAsignar = new ListaTicketsOrdenadoasPorPrioridad();
		this.usuarios = new ArrayList<Empleado>();
	}

	public double[] reporteTiempoPromedioPorPrioridad() {

		Promedio[] promedios = new Promedio[Prioridad.values().length];
		Promedio promedio;

		for (Ticket t : this.ticketsSinAsignar) {
			promedio = promedios[t.calcularPrioridad().ordinal()];
			if (promedio == null) {
				promedio = new Promedio();
				promedio = promedios[t.calcularPrioridad().ordinal()];
				promedio.incrementarPromedio(t.obtenerTiempoDeResolucion());
			}
		}
		return obtenerPromediosTotales(promedios);

	}

	private double[] obtenerPromediosTotales(Promedio[] promediosTotales) {
		double[] totales = new double[Prioridad.values().length];
		Promedio promedio;
		for (int i = 0; i < Prioridad.values().length; i++) {
			promedio = promediosTotales[i];
			if (promedio != null) {
				totales[i] = promedio.obtenerPromedio();
			}
		}
		return totales;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void agregarTicket(Ticket ticket) {
		this.ticketsSinAsignar.add(ticket);
	}

	public void agregarEmpleado(Empleado empleado) {
		this.usuarios.add(empleado);
	}
}
