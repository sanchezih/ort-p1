package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class Persona implements Vacunable {

	private static final int EDAD_MAX = 60;
	private static final int EDAD_MINIMA = 30;

	private String dni;
	private String nombre;
	private int edad;
	private boolean pacRiesgo;

	public Persona(String dni, String nombre, int edad, boolean pacRiesgo) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.pacRiesgo = pacRiesgo;
	}

	@Override
	public int getprioridad() {
		int resu = 1;
		if (this.pacRiesgo || this.edad > EDAD_MAX) {
			resu = 0;
		} else if (this.edad <= EDAD_MINIMA) {
			resu = 2;
		}
		return resu;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	private boolean isPacRiesgo() {
		return pacRiesgo;
	}

	private void setPacRiesgo(boolean pacRiesgo) {
		this.pacRiesgo = pacRiesgo;
	}

	@Override
	public String toString() {
		return "Prioridad: " + getprioridad() + " Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad
				+ ", pacRiesgo=" + pacRiesgo + "]";
	}

}
