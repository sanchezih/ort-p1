package ar.edu.ort.p1.unidades.u1.ejemplos._final._02_metodo_final.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", 10);
		persona1.imprimirDatosPersonales();

		if (persona1.esMayor()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}

		System.out.println();
		
		Empleado empleado1 = new Empleado("Carlos", 22, 10000);
		empleado1.imprimirDatosPersonales();
		empleado1.imprimirSueldo();

		if (empleado1.esMayor()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
	}

}
