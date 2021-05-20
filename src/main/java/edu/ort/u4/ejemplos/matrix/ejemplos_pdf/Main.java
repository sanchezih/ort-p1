package edu.ort.u4.ejemplos.matrix.ejemplos_pdf;

public class Main {

	public static void main(String[] args) {

		// Representando una matriz creando un array de arrays
		char[][] matLetras = { 	{ 'D', 'E', 'B', 'O' }, 
								{ 'U', 'S', 'A', 'R' },
								{ 'G', 'U', 'I', 'A' } };

		dibujar(matLetras);
		System.out.println("Cantidad de filas: " + matLetras.length);
		System.out.println("Cantidad de elementos: " + matLetras.length * matLetras[0].length);
		System.out.println("El length de la primer fila es: " + matLetras[0].length);

	//	recorrerConFor(matLetras);
	//	recorrerConForEach(matLetras);
		recorrerEnZigZag(matLetras);
	//	recorrerEsEspiral(matLetras);

	}

	// Busqueda en matriz
	public static boolean existeLetra(char[][] matLetras, char letra) {
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

	// Dibujar
	public static void dibujar(char[][] matLetras) {
		System.out.println("*** MATRIZ DE EJEMPLO ***");
		for (int i = 0; i < matLetras.length; i++) {
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.print(matLetras[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	// Recorrer todos los elementos usando ciclo for
	public static void recorrerConFor(char[][] matLetras) {
		System.out.println("\nRecorrer todos los elementos usando ciclo for");
		
		
		for (int i = 0; i < matLetras.length; i++) {
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.print(matLetras[i][j] + " ");
			}
		}
		
		
		
		
		
	}

	// Recorrer todos los elementos usando ciclo for each
	public static void recorrerConForEach(char[][] matLetras) {
		System.out.println("\n\nRecorrer todos los elementos usando ciclo for each");
		for (char[] vecLetras : matLetras) {
			for (char letra : vecLetras) {
				System.out.print(letra + " ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Recorrer todos los elementos en zigzag
	public static void recorrerEnZigZag(char[][] matLetras) {
		System.out.println("\n\nRecorrer todos los elementos en zigzag");
		for (int i = 0; i < matLetras.length; i++) {
			if (i % 2 == 0) { // fila par
				for (int j = 0; j <= matLetras[i].length - 1; j++) {
					System.out.print(matLetras[i][j] + " ");
				}
			} else { // fila impar
				for (int j = matLetras[i].length - 1; j >= 0; j--) {
					System.out.print(matLetras[i][j] + " ");
				}
			}
		}
	}

	// Recorrer todos los elementos en espiral (Todas las filas deben tener el mismo
	// length)
	public static void recorrerEsEspiral(char[][] arr) {
		System.out.println("\n\nRecorrer todos los elementos en espiral (Todas las filas deben tener el mismo length)");
		int rows = arr.length;
		int cols = arr[0].length;
		// Defining the boundaries of the matrix.
		int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

		// Defining the direction in which the array is to be traversed.
		int dir = 1;

		while (top <= bottom && left <= right) {

			if (dir == 1) { // moving left->right
				for (int i = left; i <= right; ++i) {
					System.out.print(arr[top][i] + " ");
				}
				// Since we have traversed the whole first row, move down to the next row.
				++top;
				dir = 2;
			} else if (dir == 2) { // moving top->bottom
				for (int i = top; i <= bottom; ++i) {
					System.out.print(arr[i][right] + " ");
				}
				// Since we have traversed the whole last column, move left to the previous
				// column.
				--right;
				dir = 3;
			} else if (dir == 3) { // moving right->left
				for (int i = right; i >= left; --i) {
					System.out.print(arr[bottom][i] + " ");
				}
				// Since we have traversed the whole last row, move up to the previous row.
				--bottom;
				dir = 4;
			} else if (dir == 4) { // moving bottom->up
				for (int i = bottom; i >= top; --i) {
					System.out.print(arr[i][left] + " ");
				}
				// Since we have traversed the whole first col, move right to the next column.
				++left;
				dir = 1;
			}
		}
	}

}
