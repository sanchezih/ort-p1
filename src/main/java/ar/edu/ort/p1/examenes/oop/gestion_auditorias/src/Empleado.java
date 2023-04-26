package ar.edu.ort.p1.examenes.oop.gestion_auditorias.src;

public class Empleado {

	private String nombre;
	private String apellido;
	private int legajo;

	/*----------------------------------------------------------------------------*/

	public Empleado(String nombre, String apellido, int legajo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public void mostrar() {
		System.out.println("\tAuditor: " + nombre + " " + apellido + " (Leg. " + legajo+")");
	}

}
