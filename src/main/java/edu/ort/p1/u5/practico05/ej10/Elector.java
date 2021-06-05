package edu.ort.p1.u5.practico05.ej10;

public class Elector {
	private int dni;
	private String apellido;
	private String nombre;

	public Elector(int dni, String apellido, String nombre) {
		setDni(dni);
		setApellido(apellido);
		setNombre(nombre);
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombreCompleto() {
		return getApellido() + " " + getNombre();
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}