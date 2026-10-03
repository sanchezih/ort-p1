package ar.edu.ort.p1.unidades.unidad04.ejemplos.ds.linear._02_matrix._01_ejemplo_pdf;

public class UtilMatriz {

	/**
	 * 
	 * @param matrizDeChar
	 */
	public static void mostrarMatrizDeChar(char[][] matrizDeChar) {
		for (int i = 0; i < matrizDeChar.length; i++) {
			for (int j = 0; j < matrizDeChar[i].length; j++) {
				System.out.print(matrizDeChar[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Busqueda en matriz
	 * 
	 * @param matrizDeChar
	 * @param letra
	 * @return
	 */
	public static boolean existeLetra(char[][] matrizDeChar, char letra) {
		int i = 0;
		boolean existe = false;
		while (i < matrizDeChar.length && !existe) {
			int j = 0;
			while (j < matrizDeChar[i].length && !existe) {
				if (matrizDeChar[i][j] == letra) {
					existe = true;
				}
				j++;
			}
			i++;
		}
		return existe;
	}

	/**
	 * Recorrer todos los elementos usando ciclo for
	 * 
	 * @param matrizDeChar
	 */
	public static void recorrerConFor(char[][] matrizDeChar) {
		for (int i = 0; i < matrizDeChar.length; i++) {
			for (int j = 0; j < matrizDeChar[i].length; j++) {
				System.out.print(matrizDeChar[i][j] + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Recorrer todos los elementos usando ciclo for each
	 * 
	 * @param matrizDeChar
	 */
	public static void recorrerConForEach(char[][] matrizDeChar) {
		for (char[] vecLetras : matrizDeChar) {
			for (char letra : vecLetras) {
				System.out.print(letra + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Recorrer todos los elementos en zigzag
	 * 
	 * @param matrizDeChar
	 */
	public static void recorrerEnZigZag(char[][] matrizDeChar) {
		for (int i = 0; i < matrizDeChar.length; i++) {
			if (i % 2 == 0) { // Fila par
				for (int j = 0; j <= matrizDeChar[i].length - 1; j++) {
					System.out.print(matrizDeChar[i][j] + " ");
				}
			} else { // Fila impar
				for (int j = matrizDeChar[i].length - 1; j >= 0; j--) {
					System.out.print(matrizDeChar[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * Recorrer todos los elementos en espiral (Todas las filas deben tener el mismo
	 * length)
	 * 
	 * @param matrizDeChar
	 */
	public static void recorrerEsEspiral(char[][] matrizDeChar) {

		int filas = matrizDeChar.length;
		int columnas = matrizDeChar[0].length;

		// Limites de la matriz
		int top = 0;
		int bottom = filas - 1;
		int left = 0;
		int right = columnas - 1;

		// Direccion en la que se recorrera la matriz
		int dir = 1;

		while (top <= bottom && left <= right) {

			if (dir == 1) { // moving left->right
				for (int i = left; i <= right; ++i) {
					System.out.print(matrizDeChar[top][i] + " ");
				}
				// Since we have traversed the whole first row, move down to the next row.
				++top;
				dir = 2;
			} else if (dir == 2) { // moving top->bottom
				for (int i = top; i <= bottom; ++i) {
					System.out.print(matrizDeChar[i][right] + " ");
				}
				// Since we have traversed the whole last column, move left to the previous
				// column.
				--right;
				dir = 3;
			} else if (dir == 3) { // moving right->left
				for (int i = right; i >= left; --i) {
					System.out.print(matrizDeChar[bottom][i] + " ");
				}
				// Since we have traversed the whole last row, move up to the previous row.
				--bottom;
				dir = 4;
			} else if (dir == 4) { // moving bottom->up
				for (int i = bottom; i >= top; --i) {
					System.out.print(matrizDeChar[i][left] + " ");
				}
				// Since we have traversed the whole first col, move right to the next column.
				++left;
				dir = 1;
			}
		}
		System.out.println();
	}

}
