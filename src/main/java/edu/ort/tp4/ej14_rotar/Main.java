package edu.ort.tp4.ej14_rotar;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };
		rotar(elementos);
	}

	public static void rotar(char[] letters) {
		char last = letters[letters.length - 1]; // save off first element

		// shift right
		for (int index = letters.length - 2; index >= 0; index--)
			letters[index + 1] = letters[index];

		// wrap last element into first slot
		letters[0] = last;
		System.out.print("\nshifted Array: " + Arrays.toString(letters));
	}

}
