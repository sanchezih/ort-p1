package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.estatica.impl_array.src;

import java.util.Arrays;

import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class PilaConArray implements Pila<Integer> {
	private static final int MAX = 2;
	private int top;
	private int tamanioMaximo[] = new int[MAX]; // Tamanio maximo de la pila

	// Constructor
	public PilaConArray() {
		top = -1;
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkFullness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void push(Integer element) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
		} else {
			tamanioMaximo[++top] = element;
			System.out.println("Push " + element);
		}
	}

	@Override
	public Integer pop() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			res = tamanioMaximo[top--];
		}
		return res;
	}

	@Override
	public Integer peek() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			res = tamanioMaximo[top];
		}
		return res;
	}

	@Override
	public String toString() {
		return "Pila [top=" + top + ", tamanioMaximo=" + Arrays.toString(tamanioMaximo) + "]";
	}

}