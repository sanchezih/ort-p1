package ar.edu.ort.p1.examenes.gestion_tickets.src;

import java.util.ArrayList;

public class GestorTareas {

	private ListaTicketsOrdenadoasPorPrioridad ticketsSinAsignar;
	private ArrayList<Empleado> empleados;

	public GestorTareas() {
		this.ticketsSinAsignar = new ListaTicketsOrdenadoasPorPrioridad();
		this.empleados = new ArrayList<Empleado>();
	}

	public double[] reporteTiempoPromedioPorPrioridad() {

		Promedio[] promedios = new Promedio[Prioridad.values().length];
		Promedio promedio;

		for (Ticket t : this.ticketsSinAsignar) {
			promedio = promedios[t.calcularPrioridad().ordinal()];
			if (promedio == null) {
				promedio = new Promedio();
				promedios[t.calcularPrioridad().ordinal()] = promedio;
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

	public void asignarTickets() {
		int i = 0;
		if (this.empleados.size() != 0) {
			for (Ticket t : this.ticketsSinAsignar) {
				if (i == this.empleados.size()) {
					i = 0;
				}
				this.empleados.get(i).agregarTicket(t);
				i++;
			}
			this.ticketsSinAsignar = new ListaTicketsOrdenadoasPorPrioridad(); // Limpio la lista
		}

	}
	


	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void agregarTicket(Ticket ticket) {
		this.ticketsSinAsignar.add(ticket);
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}
