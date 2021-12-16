package ar.edu.ort.p1.examenes.gestion_tickets.src;

public abstract class Error extends Ticket {

	private String descripcion;
	private String personaQueLoDetecto;

	public Error(String cliente, String unidadDeNegocio, String fechaDeCarga, String titulo,
			Empleado empleadoQueLoReporto, String descripcion, String personaQueLoDetecto) {
		super(cliente, unidadDeNegocio, fechaDeCarga, titulo, empleadoQueLoReporto);
		this.descripcion = descripcion;
		this.personaQueLoDetecto = personaQueLoDetecto;
	}

}
