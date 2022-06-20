package ar.edu.ort.p1.examenes.ds.gestor_incidentes.src;

public class Empleado {
	private String nombre;
	private String apellido;
	private String legajo;
	private ColaDeTickets ticketsAsignados;
	
	

	public Empleado(String nombre, String apellido, String legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.ticketsAsignados = new ColaDeTickets();
	}



	public void agregarTicket(Ticket ticket) {
		this.ticketsAsignados.add(ticket);
	}
}
