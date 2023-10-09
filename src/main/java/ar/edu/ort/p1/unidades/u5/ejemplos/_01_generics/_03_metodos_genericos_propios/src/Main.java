package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._03_metodos_genericos_propios.src;

import ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._03_metodos_genericos_propios.src.pojo.Persona;

/**
 * https://www.youtube.com/watch?v=7Ip_N1fbOmQ
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		// Pruebo los metodos genericos con un array de String
		String nombres[] = { "Verde", "Azul", "Naranja" };
		System.out.println(MetodosGen.getElementos(nombres));
		System.out.println("El elemento menor del array de String es " + MetodosGen.getElementoMenor(nombres));
		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Pruebo los metodos genericos con un array de Empleado
		Persona p1 = new Persona("Ana", 37);
		Persona p2 = new Persona("Luis", 24);
		Persona p3 = new Persona("Ruben", 29);
		Persona p4 = new Persona("Manuel", 51);

		Persona personas[] = { p1, p2, p3, p4 };
		System.out.println(MetodosGen.getElementos(personas));

		/*
		 * Solo podremos usar el metodo getElementoMenor si le pasamos como parametro un
		 * array de elementos que implementen la interface Comparable
		 */
		// System.out.println(MisMatrices.getElementoMenor(personas));

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Pruebo los metodos genericos con un array de Integer
		Integer int1 = Integer.valueOf(1010);
		Integer int2 = Integer.valueOf(91);
		Integer int3 = Integer.valueOf(420);

		Integer enteros[] = { int1, int2, int3 };
		System.out.println("El elemento menor del array de Integer es " + MetodosGen.getElementoMenor(enteros));

	}

}
