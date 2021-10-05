package ar.edu.ort.p1.util;

public class UtilArrays {

	/**
	 * Mostrar el contenido de un array de caracteres recibido como parametro sin
	 * valores repetidos
	 * 
	 * @param elementos
	 */
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
				System.out.print(elementos[i] + " ");
			}
		}
	}

	/**
	 * Retornar si el contenido de un array de caracteres recibido como parametro
	 * representa un palindromo.
	 * 
	 * @param elementos
	 * @return
	 */
	public static boolean isPalindromo(char[] elementos) {

		int length = elementos.length;
		boolean isPalindromo = true;
		for (int index = 0; index < elementos.length; index++) {
			if (isPalindromo) {
				int start = elementos[index];
				int end = elementos[--length];
				if (length < index) {
					break;
				}
				if (start != end) {
					isPalindromo = false;
				}
			}
		}
		return isPalindromo;
	}

	/**
	 * Invertir el contenido de un array de caracteres recibido como parámetro, sin
	 * usar un array auxiliar.
	 * 
	 * @param elementos
	 */
	public static void invertir(char[] elementos) {
		char aux;
		for (int i = 0; i < (elementos.length / 2); i++) {
			aux = elementos[i];
			elementos[i] = elementos[elementos.length - 1 - i];
			elementos[elementos.length - 1 - i] = aux;
		}
	}

	/**
	 * Rotar una posición hacia la derecha cada elemento de un array de caracteres
	 * recibido como parámetro, sin usar un array auxiliar.
	 * 
	 * @param elementos
	 */
	public static void rotar(char[] elementos) {
		char aux = elementos[elementos.length - 1];

		for (int i = elementos.length - 2; i >= 0; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[0] = aux;
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

	public static char[] unirConjuntosObviandoRepetidos(char[] cjto1, char[] cjto2) {
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

	public static void mostrarInterseccion(char[] cjto1, char[] cjto2) {
		boolean salio;
		for (int i = 0; i < cjto1.length; i++) {
			salio = false;
			for (int j = 0; j < cjto2.length; j++) {
				if (!salio && cjto1[i] == cjto2[j]) {
					System.out.print(cjto2[j] + " ");
					salio = true;
				}
			}
		}
	}

	////////////////////////////////////////////////////////////

	/**
	 * Mostrar el contenido de un array de caracteres recibido como parametro
	 * 
	 * @param elementos
	 */
	public static void mostrar(char[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i] + " ");
		}
	}

}
