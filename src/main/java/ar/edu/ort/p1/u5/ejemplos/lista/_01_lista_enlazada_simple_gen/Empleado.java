package edu.ort.p1.u5.ejemplos.lista._01_lista_enlazada_simple_gen;

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
		return nombre;
	}

}
