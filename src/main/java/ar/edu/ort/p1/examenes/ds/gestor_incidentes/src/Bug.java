package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

public class Bug extends Error {

	private final static int HS_ALTA = 12;
	private final static int HS_MEDIA = 36;

	private int tiempoEstimado;

	public Bug(String nombreCliente, String unidadNegocio, String fechaCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String nombrePersonaQueLoDetecto, int tiempoEstimado) {
		super(nombreCliente, unidadNegocio, fechaCarga, titulo, empleadoQueLoReporto, descripcion,
				nombrePersonaQueLoDetecto);
		this.tiempoEstimado = tiempoEstimado;
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
		return this.tiempoEstimado;
	}

}
