package edu.ort.u5.ejemplos.pila.pila_generica_con_arraylist;

import java.util.ArrayList;

public class Pila<TipoElemento> {

	private ArrayList<TipoElemento> listaDeElementos;// Empty array list
	private int top = -1; // Default value of top variable when stack is empty
	private int size; // Variable to store size of array

	// Constructor of this class to initiliaze stack
	Pila(int tamanio) {
		this.size = tamanio;
		this.listaDeElementos = new ArrayList<TipoElemento>(tamanio);
	}

	// To push generic element into stack
	public void push(TipoElemento elemento) {
		// Checking if array is full
		if (top + 1 == size) {

			// Display message when array is full
			System.out.println("Stack Overflow");
		} else {

			// Increment top to go to next position
			top = top + 1;

			// Over-writing existing element
			if (listaDeElementos.size() > top) {
				listaDeElementos.set(top, elemento);
			} else {
				listaDeElementos.add(elemento);
			}
		}
	}

	// To return topmost element of stack
	public TipoElemento top() {
		TipoElemento elemento = null;
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
		// If stack is empty
		if (top == -1) {

			// Display message when there are no elements in the stack
			System.out.println("Stack Underflow");
		}

		else {
			// Delete the last element by decrementing the top
			top--;
		}
	}

	// To check if stack is empty or not
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