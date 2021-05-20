package edu.ort.u4.tp4.ej13_invertir;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'A', 'B', 'C' };
		mostrar(elementos);
		System.out.println();
		invertir(elementos);
		mostrar(elementos);
	}

	public static void invertir(char[] elementos) {
		char aux;
		for (int i = 0; i < (elementos.length / 2); i++) {
			aux = elementos[i];
			elementos[i] = elementos[elementos.length - 1 - i];
			elementos[elementos.length - 1 - i] = aux;
		}
	}

	public static void mostrar(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
