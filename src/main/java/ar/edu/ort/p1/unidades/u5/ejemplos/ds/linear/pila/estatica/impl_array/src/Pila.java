package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.estatica.impl_array.src;

import java.util.Arrays;

public class Pila {

	private static final int MAX = 2;
	private int top;
	private int tamanioMaximo[] = new int[MAX]; // Tamanio maximo de la pila

	// Constructor
	public Pila() {
		top = -1;
	}

	/**
	 * 
	 * @param elemento
	 * @return
	 */
	public boolean push(int elemento) {
		boolean res = false;
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
		} else {
			tamanioMaximo[++top] = elemento;
			System.out.println("Push " + elemento);
			res = true;
		}
		return res;
	}

	public int pop() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			res = tamanioMaximo[top--];
		}
		return res;
	}

	public int peek() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			res = tamanioMaximo[top];
		}
		return res;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public String toString() {
		return "Pila [top=" + top + ", tamanioMaximo=" + Arrays.toString(tamanioMaximo) + "]";
	}

}