package ar.edu.ort.p1.examenes._02_ds.gestor_incidentes.src;

public class Incidente extends Error {

	private static final int HS_STOPPER = 12;
	private static final int HS_NO_STOPPER = 32;
	private static final int HS_ALTA = 12;
	private static final int HS_MEDIA = 32;

	private String nombreHost;
	private boolean esStopper;

	public Incidente(String nombreCliente, String unidadNegocio, String fechaCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String nombrePersonaQueLoDetecto, String nombreHost,
			boolean esStopper) {
		super(nombreCliente, unidadNegocio, fechaCarga, titulo, empleadoQueLoReporto, descripcion,
				nombrePersonaQueLoDetecto);
		this.nombreHost = nombreHost;
		this.esStopper = esStopper;
	}

	@Override
	public Prioridad calcularPrioridad() {
		int tiempoEstimado = obtenerTiempoDeResolucion();
		Prioridad prioridad;
		if (tiempoEstimado <= HS_ALTA) {
			prioridad = Prioridad.ALTA;
		} else {
			if (tiempoEstimado <= HS_MEDIA) {
				prioridad = Prioridad.MEDIA;
			} else {
				prioridad = Prioridad.BAJA;
			}
		}
		return prioridad;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		int tiempoEstimado = HS_NO_STOPPER;
		if (this.esStopper) {
			tiempoEstimado = HS_STOPPER;
		}
		return tiempoEstimado;
	}

}
