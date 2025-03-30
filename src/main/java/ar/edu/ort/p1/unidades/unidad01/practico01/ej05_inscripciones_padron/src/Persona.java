package ar.edu.ort.p1.unidades.unidad01.practico01.ej05_inscripciones_padron.src;

import com.github.sanchezih.util.Fecha;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private Genero genero;
	private Fecha fechaNacimiento;

	/*----------------------------------------------------------------------------*/

	public Persona(String dni, String nombre, String apellido, Genero genero, Fecha fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	/*----------------------------------------------------------------------------*/

	public String getDni() {
		return dni;
	}

	public String getNombreApellido() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
