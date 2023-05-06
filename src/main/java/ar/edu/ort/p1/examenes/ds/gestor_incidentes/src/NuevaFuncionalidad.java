package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

public class NuevaFuncionalidad extends Ticket {
	private String descripcionFuncional;
	private int tiempoDesarrollo;
	private Prioridad prioridad;

	public NuevaFuncionalidad(String nombreCliente, String unidadNegocio, String fechaCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcionFuncional, int tiempoDesarrollo, Prioridad prioridad) {
		super(nombreCliente, unidadNegocio, fechaCarga, titulo, empleadoQueLoReporto);
		this.descripcionFuncional = descripcionFuncional;
		this.tiempoDesarrollo = tiempoDesarrollo;
		this.prioridad = prioridad;
	}

	@Override
	public Prioridad calcularPrioridad() {
		return this.prioridad;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		return this.tiempoDesarrollo;
	}

}
