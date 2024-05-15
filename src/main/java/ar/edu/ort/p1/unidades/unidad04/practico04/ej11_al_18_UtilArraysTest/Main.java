package ar.edu.ort.p1.unidades.unidad04.practico04.ej11_al_18_UtilArraysTest;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                    EJERCICIOS CON ARRAY                    |");
		System.out.println("+------------------------------------------------------------+");

		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };

		/*----------------------------------------------------------------------------*/

		System.out.print("Array inicial: ");
		UtilArrays.mostrar(elementos);

		System.out.println();

		// Test ejercicio 11
		System.out.print("Ejercicio 11 - Muestro el array sin repetidos: ");
		UtilArrays.mostrarSinRepetidos(elementos);

		// Test ejercicio 12
		System.out.print("Ejercicio 12 - El array es palindormo?: ");
		System.out.println(UtilArrays.isPalindromo(elementos) ? "Es palindromo" : "No es palindromo");

		// Test ejercicio 13
		System.out.print("Ejercicio 13 - Invierto el array (" + new String(elementos) + "): ");
		UtilArrays.invertir(elementos);

		// Test ejercicio 14
		System.out.print("Ejercicio 14 - Roto el array (" + new String(elementos) + "): ");
		UtilArrays.rotar(elementos);

		System.out.println();

		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                    TEORIA DE CONJUNTOS                     |");
		System.out.println("+------------------------------------------------------------+");

		char conjunto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char conjunto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		System.out.println("Conjunto 1: " + new String(conjunto1));
		System.out.println("Conjunto 2: " + new String(conjunto2));

		System.out.println();

		// Test ejercicio 15
		System.out.print("Ejercicio 15 - Muestro la union de dos conjuntos: ");
		UtilArrays.mostrarSinRepetidos(UtilArrays.unirConjuntos(conjunto1, conjunto2));

		// Test ejercicio 16
		System.out.print("Ejercicio 16 - Muestro la interseccion de dos conjuntos: ");
		UtilArrays.mostrarInterseccion(conjunto1, conjunto2);

		// Test ejercicio 17
		System.out.print("Ejercicio 17 - Muestro la diferencia entre dos conjuntos: ");
		UtilArrays.mostrarDiferencia(conjunto1, conjunto2);

		// Test ejercicio 18
		System.out.print("Ejercicio 18 - Muestro la diferencia simetrica entre dos conjuntos: ");
		UtilArrays.mostrarDiferenciaSimetrica(conjunto1, conjunto2);

	}

}
