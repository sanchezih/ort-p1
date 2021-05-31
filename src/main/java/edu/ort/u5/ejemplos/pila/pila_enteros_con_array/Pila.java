package edu.ort.u5.ejemplos.pila.pila_enteros_con_array;

public class Pila {
	private static final int MAX = 1000;
	private int top;
	private int tamanioMaximo[] = new int[MAX]; // Tamanio maximo de la pila

	Pila() {
		top = -1;
	}

	boolean push(int elemento) {
		boolean res = false;
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
		} else {
			tamanioMaximo[++top] = elemento;
			System.out.println(elemento + " pushed into stack");
			res = true;
		}
		return res;
	}

	int pop() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			int x = tamanioMaximo[top--];
			res = x;
		}
		return res;
	}

	int peek() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			int x = tamanioMaximo[top];
			res = x;
		}
		return res;
	}

	boolean isEmpty() {
		return (top < 0);
	}

}