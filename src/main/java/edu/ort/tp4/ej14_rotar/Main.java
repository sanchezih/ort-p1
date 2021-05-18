package edu.ort.tp4.ej14_rotar;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		rotar(elementos);
	}

	public static void rotar(char[] elementos) {
		for (int i = elementos.length - 2; i >= 0; i--)
			elementos[i + 1] = elementos[i];
		elementos[0] = elementos[elementos.length - 1];
		System.out.print("\nshifted Array: " + Arrays.toString(elementos));
	}

}
