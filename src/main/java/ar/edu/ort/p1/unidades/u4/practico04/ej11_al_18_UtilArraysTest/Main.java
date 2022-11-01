package ar.edu.ort.p1.unidades.u4.practico04.ej11_al_18_UtilArraysTest;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {

		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };

		char conjunto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char conjunto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		/*----------------------------------------------------------------------------*/

		System.out.print("Muestro el array: ");
		UtilArrays.mostrar(elementos);

		// Test ejercicio 11
		System.out.print("Muestro el array sin repetidos: ");
		UtilArrays.mostrarSinRepetidos(elementos);

		// Test ejercicio 12
		System.out.print("El array es palindormo?: ");
		System.out.println(UtilArrays.isPalindromo(elementos) ? "Es palindromo" : "No es palindromo");

		// Test ejercicio 13
		System.out.print("Invierto el array: ");
		UtilArrays.invertir(elementos);

		// Test ejercicio 14
		System.out.print("Roto el array: ");
		UtilArrays.rotar(elementos);

		// Test ejercicio 15
		System.out.print("unirConjuntos: ");
		UtilArrays.mostrarSinRepetidos(UtilArrays.unirConjuntos(conjunto1, conjunto2));
		System.out.print("unirConjuntosObviandoRepetidos: ");
		UtilArrays.mostrar(UtilArrays.unirConjuntosObviandoRepetidos(conjunto1, conjunto2));

		// Test ejercicio 16
		System.out.print("mostrarInterseccion: ");
		UtilArrays.mostrarInterseccion(conjunto1, conjunto2);

		// Test ejercicio 17
		System.out.print("mostrarDiferencia: ");
		UtilArrays.mostrarDiferencia(conjunto1, conjunto2);

		// Test ejercicio 18
		System.out.print("mostrarDiferenciaSimetrica: ");
		UtilArrays.mostrarDiferenciaSimetrica(conjunto1, conjunto2);

	}

}
