package edu.ort.cdv.u6.ejercicios.transportista.clases;

public class Chofer {
	private int dni;
	private int legajo;
	private String nombre;

	public Chofer(int dni, int legajo, String nombre) {
		this.setDni(dni);
		this.setLegajo(legajo);
		this.setNombre(nombre);
	}

	public int getDni() {
		return dni;
	}

	public int getLegajo() {
		return legajo;
	}

	public String getNombre() {
		return nombre;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	private void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Chofer [dni=" + dni + ", legajo=" + legajo + ", nombre=" + nombre + "]";
	}
	
}
