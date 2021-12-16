package ar.edu.ort.p1.examenes.gestion_tickets.src;

public class Incidente extends Error {

	private String nombreDelHost;
	private boolean esStopper;
	private final static int STOPPER = 12;
	private final static int NO_STOPPER = 32;

	public Incidente(String cliente, String unidadDeNegocio, String fechaDeCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String personaQueLoDetecto, String nombreDelHost,
			boolean esStopper) {
		super(cliente, unidadDeNegocio, fechaDeCarga, titulo, empleadoQueLoReporto, descripcion, personaQueLoDetecto);
		this.nombreDelHost = nombreDelHost;
		this.esStopper = esStopper;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		int tiempo;
		if (this.esStopper) {
			tiempo = this.STOPPER;
		} else {
			tiempo = this.NO_STOPPER;
		}
		return tiempo;
	}

	public Prioridad calcularPrioridad() {
		int tiempoEstimado = obtenerTiempoDeResolucion();
		Prioridad prioridad;
		if (tiempoEstimado <= 12) {
			prioridad = Prioridad.ALTA;
		} else {
			prioridad = Prioridad.MEDIA;
		}
		return prioridad;
	}
}
