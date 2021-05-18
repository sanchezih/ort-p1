package edu.ort.tp4.ej12_palindromo;

public class Main {
	public static void main(String[] args) {
		char elementos[] = { 'I', 'N', 'M', 'I', 'N', 'E', 'N', 'T', 'E' };

		if (IsPalindromo(elementos)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}

	public static boolean IsPalindromo(char[] array) {

		int length = array.length;
		boolean isPalindromo = true;
		for (int index = 0; index < array.length; index++) {
			if (isPalindromo) {
				int start = array[index];
				int end = array[--length];
				if (length < index) {
					break;
				}
				if (start != end) {
					isPalindromo = false;
				}
			}
		}
		return isPalindromo;
	}
}
