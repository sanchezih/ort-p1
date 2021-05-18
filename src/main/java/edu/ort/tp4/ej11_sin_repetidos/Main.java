package edu.ort.tp4.ej11_sin_repetidos;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		mostrarSinRepetidos(elementos);
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
