package ar.edu.ort.p1.unidades.u1.ejemplos._final._02_metodo_final.src;

public class Persona {

	protected String nombre;
	protected int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void imprimirDatosPersonales() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	public final boolean esMayor() {
		boolean esMayor = false;
		if (edad >= 18) {
			esMayor = true;
		}
		return esMayor;
	}
}
