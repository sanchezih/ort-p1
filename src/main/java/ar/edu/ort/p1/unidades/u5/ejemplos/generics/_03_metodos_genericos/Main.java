package ar.edu.ort.p1.unidades.u5.ejemplos.generics._03_metodos_genericos;

/**
 * https://www.youtube.com/watch?v=7Ip_N1fbOmQ
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		/****** PROGRAMACION GENERICA ******/

		// Pruebo los metodos genericos con un array de String
		String nombres[] = { "Verde", "Azul", "Naranja" };
		System.out.println(MisMatrices.getElementos(nombres));
		System.out.println("El elemento menor del array de String es " + MisMatrices.getElementoMenor(nombres));
		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Pruebo los metodos genericos con un array de Empleado
		Empleado e1 = new Empleado("Ana");
		Empleado e2 = new Empleado("Luis");
		Empleado e3 = new Empleado("Ruben");
		Empleado e4 = new Empleado("Manuel");

		Empleado empleados[] = { e1, e2, e3, e4 };
		System.out.println(MisMatrices.getElementos(empleados));

		/*
		 * Solo podremos usar el metodo getElementoMenor si le pasamos como parametro un
		 * array de elementos que implementen la interface Comparable
		 */
		// System.out.println(MisMatrices.getElementoMenor(empleados));

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Pruebo los metodos genericos con un array de Integer
		Integer int1 = Integer.valueOf(1010);
		Integer int2 = Integer.valueOf(91);
		Integer int3 = Integer.valueOf(420);

		Integer enteros[] = { int1, int2, int3 };
		System.out.println("El elemento menor del array de Integer es " + MisMatrices.getElementoMenor(enteros));

	}

}
