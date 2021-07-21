package ar.edu.ort.p1.u1.ejemplos.primera_clase;

public class Persona {
	String nombre;
	String apellido;
	final String DNI;

	public Persona(String n, String a, String d) {
		nombre = n;
		apellido = a;
		DNI = d;
	}

	void saludar() {
		System.out.println("Hola!");
	}

	String nombreCompleto() {
		return nombre + " " + apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
