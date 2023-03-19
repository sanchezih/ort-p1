package ar.edu.ort.p1.unidades.u3.practico03.ej08_admin_de_personal.src;

import java.util.Calendar;

public abstract class Empleado {

	private String dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;

	public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAniosDeAntiguedad() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.anioIngreso;
	}

	/*----------------------------------------------------------------------------*/

	public void mostrarDatos() {

		// getSalario() se resuelve en tiempo de ejecucion

		System.out.println("\t -> " + getNombreCompleto() + ": $" + getSalario());
	}

	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	/*----------------------------------------------------------------------------*/

	public abstract double getSalario();

}
