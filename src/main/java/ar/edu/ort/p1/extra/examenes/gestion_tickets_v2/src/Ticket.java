package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public abstract class Ticket implements Estimable {

	private String cliente;
	private String unidadDeNegocio;
	private String fechaDeCarga;
	private String titulo;
	private Empleado empleadoQueLoReporto;

	public Prioridad calcularPrioridad() {
		int tiempoEstimado = obtenerTiempoDeResolucion();
		Prioridad prioridad;

		if (tiempoEstimado <= 12) {
			prioridad = Prioridad.ALTA;
		} else {
			if (tiempoEstimado <= 36) {
				prioridad = Prioridad.MEDIA;
			} else {
				prioridad = Prioridad.BAJA;
			}
		}
		return prioridad;

	}

}
