package edu.ort.tp4.ej16_interseccion;

public class Main {
	public static void main(String[] args) {
		char cjto1[] = { 'B', 'L', 'A', 'N', 'C', 'O' };
		char cjto2[] = { 'S', 'A', 'L', 'M', 'O', 'N', 'L', 'L' };
		// mostrarInterseccion(obtenerInterseccion(cjto1, cjto2));
		mostrarInterseccion(cjto1, cjto2);

	}

	public static void mostrarInterseccion(char[] cjto1, char[] cjto2) {
		boolean salio;
		for (int i = 0; i < cjto1.length; i++) {
			salio = false;
			for (int j = 0; j < cjto2.length; j++) {
				if (cjto1[i] == cjto2[j] && !salio) {
					System.out.print(cjto2[j]);
					salio = true;
				}
			}
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
