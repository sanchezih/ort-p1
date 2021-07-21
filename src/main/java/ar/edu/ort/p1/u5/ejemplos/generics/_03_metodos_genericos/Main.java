package ar.edu.ort.p1.u5.ejemplos.generics._03_metodos_genericos;

public class Main {

	public static void main(String[] args) {

		/******* PROGRAMACION GENERICA *******/

		/* Ejemplo con objetos de tipo String */
		String nombres[] = { "Azul", "Verde", "Naranja" };
		System.out.println(MisMatrices.getElementos(nombres));
		System.out.println(MisMatrices.getElementoMenor(nombres));

		/* Ejemplo con objetos de tipo Empleado */

		// Creo una serie de empleados
		Empleado e1 = new Empleado("Ana");
		Empleado e2 = new Empleado("Luis");
		Empleado e3 = new Empleado("Ruben");
		Empleado e4 = new Empleado("Manuel");

		Empleado empleados[] = { e1, e2, e3, e4 };
		System.out.println(MisMatrices.getElementos(empleados));

		/* Ejemplo con objetos de tipo Integer */
		Integer int1 = Integer.valueOf(1010);
		Integer int2 = Integer.valueOf(569);
		Integer int3 = Integer.valueOf(420);

		Integer enteros[] = { int1, int2, int3 };
		System.out.println(MisMatrices.getElementoMenor(enteros));

	}

}
