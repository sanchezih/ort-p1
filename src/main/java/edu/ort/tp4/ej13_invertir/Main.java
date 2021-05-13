package edu.ort.tp4.ej13_invertir;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'A', 'B', 'C' };
		mostrar(elementos);
		invertir(elementos);
		mostrar(elementos);
	}

	public static void invertir(char[] array) {
		char aux;
		for (int i = 0; i < (array.length / 2); i++) {
			aux = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
	}

	public static void mostrar(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
