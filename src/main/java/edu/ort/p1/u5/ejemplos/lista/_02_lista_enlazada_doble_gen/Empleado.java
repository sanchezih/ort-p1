package edu.ort.p1.u5.ejemplos.lista._02_lista_enlazada_doble_gen;

public class Empleado {

	private String nombre;
	private int edad;

	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[" + nombre + "]";
	}

}
