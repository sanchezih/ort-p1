package ar.edu.ort.p1.unidades.unidad03.ejemplos._02_overriding.ejemplo01.src;

public class Persona {

	private String nombre;
	private String apellido;

	/*----------------------------------------------------------------------------*/

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/*----------------------------------------------------------------------------*/

	public void mostrar() {
		System.out.println(nombre + " " + apellido);
	}

}