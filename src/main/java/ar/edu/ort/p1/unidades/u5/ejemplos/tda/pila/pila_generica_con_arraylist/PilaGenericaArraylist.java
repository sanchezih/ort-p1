package ar.edu.ort.p1.unidades.u5.ejemplos.tda.pila.pila_generica_con_arraylist;

import java.util.ArrayList;

public class PilaGenericaArraylist<T> {

	private ArrayList<T> listaDeElementos;
	private int top = -1;
	private int tamanio;

	public PilaGenericaArraylist() {
		this.tamanio = 0;
		this.listaDeElementos = new ArrayList<T>(tamanio);
	}

	public PilaGenericaArraylist(int tamanio) {
		this.tamanio = tamanio;
		this.listaDeElementos = new ArrayList<T>(tamanio);
	}

	public void push(T elemento) {
		if (top + 1 == tamanio) {
			System.out.println("Stack Overflow");
		} else {
			top = top + 1;
			if (listaDeElementos.size() > top) {
				listaDeElementos.set(top, elemento);
			} else {
				listaDeElementos.add(elemento);
			}
		}
	}

	// To return topmost element of stack
	public T peek() {
		T elemento = null;
		// If stack is empty
		if (top == -1) {
			// Display message when there are no elements in the stack
			System.out.println("Stack Underflow");
		}

		// else elements are present so return the topmost element
		else {
			elemento = listaDeElementos.get(top);
		}
		return elemento;
	}

	// To delete last element of stack
	public void pop() {
		if (top == -1) { // If stack is empty
			System.out.println("Stack Underflow");
		} else {

			// Delete the last element by decrementing the top
			top--;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < top; i++) {
			res += String.valueOf(listaDeElementos.get(i)) + "->";
		}
		res += String.valueOf(listaDeElementos.get(top));
		return res;
	}

}