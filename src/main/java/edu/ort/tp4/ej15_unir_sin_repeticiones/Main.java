package edu.ort.tp4.ej15_unir_sin_repeticiones;

public class Main {
	public static void main(String[] args) {
		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		mostrarSinRepetidos(unirConjuntos(cjto1, cjto2));

	}

	public static char[] unirConjuntos(char[] a, char[] b) {
		char[] c = new char[a.length + b.length];
		char k = 0;
		for (char n : a) {
			c[k++] = n;
		}
		for (char n : b) {
			c[k++] = n;
		}
		return c;
	}

	public static void mostrarSinRepetidos(char[] elementos) {
		int j;
		boolean salio;
		for (int i = 0; i < elementos.length; i++) {
			j = 0;
			salio = false;
			while (j < i && !salio) {
				if (elementos[i] == elementos[j]) {
					salio = true;
				}
				j++;
			}
			if (!salio) {
				System.out.print(elementos[i]);
			}
		}
	}

}
