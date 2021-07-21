package ar.edu.ort.p1.u4.practico04.ej14_rotar;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		rotar(elementos);
		mostrar(elementos);
	}

	public static void rotar(char[] elementos) {
		char aux = elementos[elementos.length - 1];

		for (int i = elementos.length - 2; i >= 0; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[0] = aux;
	}

	public static void mostrar(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
