package ar.edu.ort.p1.examenes.gestion_tickets.src;

public abstract class Ticket implements Estimable {

	private String cliente;
	private String unidadDeNegocio;
	private String fechaDeCarga;
	private String titulo;
	private Empleado empleadoQueLoReporto;

	public Ticket(String cliente, String unidadDeNegocio, String fechaDeCarga, String titulo,
			Empleado empleadoQueLoReporto) {
		this.cliente = cliente;
		this.unidadDeNegocio = unidadDeNegocio;
		this.fechaDeCarga = fechaDeCarga;
		this.titulo = titulo;
		this.empleadoQueLoReporto = empleadoQueLoReporto;
	}

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
