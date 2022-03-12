package ar.edu.ort.p1.unidades.u1.practico01.ej05_inscripciones_padron.src;

import ar.edu.ort.p1.util.Fecha;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private Genero genero;
	private Fecha fechaNacimiento;

	public Persona(String dni, String nombre, String apellido, Genero genero, Fecha fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreApellido() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
