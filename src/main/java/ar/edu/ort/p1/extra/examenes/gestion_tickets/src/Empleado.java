package ar.edu.ort.p1.extra.examenes.gestion_tickets.src;

public class Empleado {

	private String nombre;
	private String apellido;
	private String proyecto;
	private ColaDeTickets tareasAsignadas;

	public Empleado(String nombre, String apellido, String proyecto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.proyecto = proyecto;
		this.tareasAsignadas = new ColaDeTickets();
	}

	public void agregarTicket(Ticket ticket) {
		this.tareasAsignadas.add(ticket);
	}
}
