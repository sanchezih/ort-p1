package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_arraylist_generic.src;

import java.util.ArrayList;

public class Pila<T> {

	private ArrayList<T> elementos;
	private int top = -1;
	private int tamanio;

	// Constructores
	public Pila() {
		this.tamanio = 0;
		this.elementos = new ArrayList<T>(tamanio);
	}

	public Pila(int tamanio) {
		this.tamanio = tamanio;
		this.elementos = new ArrayList<T>(tamanio);
	}

	/**
	 * 
	 * @param elemento
	 */
	public void push(T elemento) {
		if (top + 1 == tamanio) {
			System.out.println("Stack Overflow");
		} else {
			top = top + 1;
			if (elementos.size() > top) {
				elementos.set(top, elemento);
			} else {
				elementos.add(elemento);
			}
		}
	}

	/**
	 * To return topmost element of stack
	 * 
	 * @return
	 */
	public T peek() {
		T elemento = null;
		// If stack is empty
		if (top == -1) {
			// Display message when there are no elements in the stack
			System.out.println("Stack Underflow");
		}

		// else elements are present so return the topmost element
		else {
			elemento = elementos.get(top);
		}
		return elemento;
	}

	/**
	 * To delete last element of stack
	 */
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
			res += String.valueOf(elementos.get(i)) + "->";
		}
		res += String.valueOf(elementos.get(top));
		return res;
	}

}