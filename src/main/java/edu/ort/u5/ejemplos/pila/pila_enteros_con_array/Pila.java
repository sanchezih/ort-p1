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
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = tamanioMaximo[top--];
			return x;
		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = tamanioMaximo[top];
			return x;
		}
	}

	boolean isEmpty() {
		return (top < 0);
	}

}