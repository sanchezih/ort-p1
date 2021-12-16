/**
 * Programa Java para ilustrar el error al usar la clase desde un mismo paquete con modificador private
 */
package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._1_private.error;

class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();

		/* Trato de acceder a un metodo privado la clase Persona */
		//persona.saludar(); // DESCOMENTAR
	}
}