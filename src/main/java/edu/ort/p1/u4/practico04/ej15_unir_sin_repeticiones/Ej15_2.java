package edu.ort.p1.u4.practico04.ej15_unir_sin_repeticiones;

public class Ej15_2 {
	public static void main(String[] args) {
		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N' };

		mostrar(unirConjuntos(cjto1, cjto2));
	}

	public static void mostrar(char[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i]);
		}
	}

	public static char[] unirConjuntos(char[] cjto1, char[] cjto2) {
		char[] res = new char[cjto1.length + cjto2.length];
		char i = 0;
		for (char c : cjto1) {
			if (!contiene(res, c)) {
				res[i++] = c;
			}
		}
		for (char c : cjto2) {
			if (!contiene(res, c)) {
				res[i++] = c;
			}
		}
		return res;
	}

	public static boolean contiene(char[] elementos, char key) {
		boolean existe = false;
		int i = 0;
		while (i < elementos.length && !existe) {
			if (elementos[i] == key) {
				existe = true;
			}
			i++;
		}
		return existe;
	}
}
