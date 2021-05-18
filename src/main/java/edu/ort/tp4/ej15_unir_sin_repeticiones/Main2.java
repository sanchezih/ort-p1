package edu.ort.tp4.ej15_unir_sin_repeticiones;

public class Main2 {
	public static void main(String[] args) {
		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		mostrar(unirConjuntos(cjto1, cjto2));

	}

	public static char[] unirConjuntos(char[] a, char[] b) {
		char[] c = new char[a.length + b.length];
		char k = 0;
		for (char n : a) {
			if (!contiene(c, n)) {
				c[k++] = n;
			}
		}
		for (char n : b) {
			if (!contiene(c, n)) {
				c[k++] = n;
			}
		}
		return c;
	}

	public static void mostrar(char[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i]);
		}
	}

	public static boolean contiene(char[] elementos, char target) {
		boolean existe = false;
		int i = 0;
		while (i < elementos.length && !existe) {
			if (elementos[i] == target) {
				existe = true;
			}
			i++;
		}
		return existe;
	}
}
