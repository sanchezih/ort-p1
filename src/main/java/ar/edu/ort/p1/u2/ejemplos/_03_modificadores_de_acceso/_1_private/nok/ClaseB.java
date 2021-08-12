//Programa Java para ilustrar el error al usar la clase desde un mismo paquete con modificador private
package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._1_private.nok;

class ClaseB {

	public static void main(String[] args) {

		ClaseA obj = new ClaseA();

		// Trato de acceder a un metodo privado la clase ClaseA
		// obj.mostrar(); //DESCOMENTAR
	}
}