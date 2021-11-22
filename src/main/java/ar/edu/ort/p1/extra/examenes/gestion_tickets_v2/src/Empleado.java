package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class Empleado {

	private String nombre;
	private String apellido;
	private String proyecto;
	private ColaDeTareas tareasAsignadas;

	public Empleado(String nombre, String apellido, String proyecto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.proyecto = proyecto;
		this.tareasAsignadas = new ColaDeTareas();
	}

}
