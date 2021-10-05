package ar.edu.ort.p1.u4.practico04.ej11al18_UtilArraysTest;

import ar.edu.ort.p1.util.UtilArrays;

public class Main {

	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };

		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		// 11
		UtilArrays.mostrarSinRepetidos(elementos);

		// 12
		if (UtilArrays.isPalindromo(elementos)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}

		// 13
		UtilArrays.mostrar(elementos);
		System.out.println();
		UtilArrays.invertir(elementos);
		UtilArrays.mostrar(elementos);

		// 14
		UtilArrays.mostrar(elementos);
		System.out.println();
		UtilArrays.rotar(elementos);
		UtilArrays.mostrar(elementos);

		// 15
		UtilArrays.mostrarSinRepetidos(UtilArrays.unirConjuntos(cjto1, cjto2));
		UtilArrays.mostrar(UtilArrays.unirConjuntosObviandoRepetidos(cjto1, cjto2));

		// 16
		UtilArrays.mostrarInterseccion(cjto1, cjto2);

	}

}
