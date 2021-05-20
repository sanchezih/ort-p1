package edu.ort.u4.tp4.ej15_unir_sin_repeticiones;

public class Ej15_1 {
	public static void main(String[] args) {
		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		mostrarSinRepetidos(unirConjuntos(cjto1, cjto2));
	}

	public static char[] unirConjuntos(char[] cjto1, char[] cjto2) {
		char[] res = new char[cjto1.length + cjto2.length];
		char i = 0;
		for (char c : cjto1) {
			res[i++] = c;
		}
		for (char c : cjto2) {
			res[i++] = c;
		}
		return res;
	}

	public static void mostrarSinRepetidos(char[] elementos) {
		int j;
		boolean salio;
		for (int i = 0; i < elementos.length; i++) {
			j = 0;
			salio = false;
			while (!salio && j < i) {
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
