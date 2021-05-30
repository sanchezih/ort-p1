package edu.ort.u5.tad.test.entidades;

public class Empleado {

	private int legajo;
	private String nombre;

	public Empleado(int legajo, String nombre) {
		this.setLegajo(legajo);
		this.setNombre(nombre);
	}

	public int getLegajo() {
		return legajo;
	}

	private void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", nombre=" + nombre + "]";
	}

}
