package edu.ort.u4.ejemplos.matrix.primeramatriz;

public class Main {

	public static void main(String[] args) {

		// Representando una matriz creando un array de arrays
		char[][] matLetras = { { 'D', 'E', 'B', 'O' }, { 'U', 'S', 'A', 'R' }, { 'G', 'U', 'I', 'A' } };

		// System.out.println(matLetras.length);

		// System.out.println(matLetras[0].length);
		// System.out.println(matLetras[1].length);
		// System.out.println(matLetras[2].length);

		// System.out.println(matLetras.length * matLetras[0].length);

		// recorrerConFor(matLetras);
		//recorrerConForEach(matLetras);
		

	}

	public static void recorrerConFor(char[][] matLetras) {
		for (int i = 0; i < matLetras.length; i++) {
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.println(matLetras[i][j]);
			}
		}
	}

	public static void recorrerConForEach(char[][] matLetras) {
		for (char[] vecLetras : matLetras) {
			for (char letra : vecLetras) {
				System.out.println(letra);
			}
		}
	}

	public static boolean buscar(char[][] matLetras, char letra) {
		int i = 0;
		boolean existe = false;
		while (i < matLetras.length && !existe) {
			int j = 0;
			while (j < matLetras[i].length && !existe) {
				if (matLetras[i][j] == letra) {
					existe = true;
				}
				j++;
			}
			i++;

		}
		return existe;
	}

	public static void recorrerEnZigZag() {
		// Recorrer todos los elementos en zigzag
		// https://es.stackoverflow.com/questions/143819/c%C3%B3mo-puedo-generar-una-matriz-zig-zag-de-este-tipo

		int numeros[][] = new int[4][4];
		int contador = 0;

		for (int i = 0; i < 4; i++) {

			if (i % 2 == 0) { // Ascendente en pares
				for (int j = 0; j < 4; j++) {
					numeros[i][j] = contador;
					contador++;
				}

			} else { // Descendente en impares
				for (int j = 3; j >= 0; j--) {
					numeros[i][j] = contador;
					contador++;
				}
			}
		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.print(numeros[i][j] + "\t");
			}

			System.out.println("");
		}
	}

	public static void recorrerEsEspiral() {
	}

}
