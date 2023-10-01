package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear._02_matrix._01_ejemplo_pdf;

public class Main {

	public static void main(String[] args) {

		// Modelo una matriz creando un array de arrays
		char[][] matrizDeLetras = { { 'D', 'E', 'B', 'O' }, { 'U', 'S', 'A', 'R' }, { 'G', 'U', 'I', 'A' } };

		System.out.println("=== MATRIZ DE EJEMPLO ===");
		UtilMatriz.mostrarMatrizDeChar(matrizDeLetras);

		System.out.println("========= DATOS =========");
		System.out.println("\t-> Cantidad de filas: " + matrizDeLetras.length);
		System.out.println("\t-> Cantidad de elementos: " + matrizDeLetras.length * matrizDeLetras[0].length);
		System.out.println("\t-> El length de la primer fila es: " + matrizDeLetras[0].length);
		System.out.println("\t-> En la matriz, existe R?: " + UtilMatriz.existeLetra(matrizDeLetras, 'R'));
		System.out.println("\t-> En la matriz, existe Z?: " + UtilMatriz.existeLetra(matrizDeLetras, 'Z'));

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("======= RECORRIDOS ======");

		System.out.println("Recorrer todos los elementos usando ciclo for");
		UtilMatriz.recorrerConFor(matrizDeLetras);
		System.out.println();

		System.out.println("Recorrer todos los elementos usando ciclo for each");
		UtilMatriz.recorrerConForEach(matrizDeLetras);
		System.out.println();

		System.out.println("Recorrer todos los elementos en zigzag");
		UtilMatriz.recorrerEnZigZag(matrizDeLetras);
		System.out.println();

		System.out.println("Recorrer todos los elementos en espiral (Todas las filas deben tener el mismo length)");
		UtilMatriz.recorrerEsEspiral(matrizDeLetras);

	}

}
