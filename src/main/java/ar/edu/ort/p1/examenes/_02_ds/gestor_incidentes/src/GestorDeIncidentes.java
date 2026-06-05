package ar.edu.ort.p1.examenes._02_ds.gestor_incidentes.src;

public class GestorDeIncidentes {

	private ListaDeTicketsOrdenadosPorPrioridad ticketsSinAsignar;
	private ColaDeEmpleados empleados;

	/*----------------------------------------------------------------------------*/

	public GestorDeIncidentes() {
		this.ticketsSinAsignar = new ListaDeTicketsOrdenadosPorPrioridad();
		this.empleados = new ColaDeEmpleados();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo reporteTiempoPromedioPorPrioridad(), de la clase que
	 * corresponda, que en base a las tareas ingresadas y no asignadas debe calcular
	 * y devolver (no mostrar por consola) el tiempo promedio estimado para cada
	 * prioridad.
	 * 
	 * @return
	 */
	public double[] reporteTiempoPromedioTareasPorPrioridad() {
		Promedio[] promedios = new Promedio[Prioridad.values().length];
		Promedio promedio;
		Ticket cent = new Bug(null, null, null, null, null, null, null, -1);
		Ticket t;
		inicializarPromedios(promedios);
		this.ticketsSinAsignar.add(cent);
		t = this.ticketsSinAsignar.removeAt(0);
		while (t != cent) {
			promedio = promedios[t.calcularPrioridad().ordinal()];
			promedio.incrementarPromedio(t.obtenerTiempoDeResolucion());
			this.ticketsSinAsignar.add(t);
			t = this.ticketsSinAsignar.removeAt(0);
		}
		return obtenerPromediosTotales(promedios);
	}

	/**
	 * 
	 * @param promediosObj
	 */
	private void inicializarPromedios(Promedio[] promediosObj) {
		for (int i = 0; i < promediosObj.length; i++) {
			promediosObj[i] = new Promedio();
		}
	}

	/**
	 * 
	 * @param promediosObj
	 * @return
	 */
	private double[] obtenerPromediosTotales(Promedio[] promediosObj) {
		double[] promediosNum = new double[promediosObj.length];
		for (int i = 0; i < promediosObj.length; i++) {
			promediosNum[i] = promediosObj[i].obtenerPromedio();
		}
		return promediosNum;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo asignarTickets() de la clase que corresponda, que debe
	 * asignar a los empleados todos los tickets disponibles, dejando la estructura
	 * vacia. La asignacion debe hacerse como se indico anteriormente.
	 */
	public void asignarTickets() {
		Empleado e;
		if (!this.empleados.isEmpty()) {
			while (!this.ticketsSinAsignar.isEmpty()) {
				e = this.empleados.remove();
				e.agregarTicket(ticketsSinAsignar.removeAt(0));
				this.empleados.add(e);
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}
