package edu.ort.u5.ejemplos.pila.pila_generica_con_arraylist;

import java.util.ArrayList;

public class Pila<TipoElemento> {

	ArrayList<TipoElemento> A;// Empty array list
	int top = -1; // Default value of top variable when stack is empty
	int size; // Variable to store size of array

	// Constructor of this class to initiliaze stack
	Pila(int tamanio) {
		// Storing the value of size into global variable
		this.size = tamanio;

		// Creating array of Size = size
		this.A = new ArrayList<TipoElemento>(tamanio);
	}

	// Method 1
	// To push generic element into stack
	void push(TipoElemento elemento) {
		// Checking if array is full
		if (top + 1 == size) {

			// Display message when array is full
			System.out.println("Stack Overflow");
		} else {

			// Increment top to go to next position
			top = top + 1;

			// Over-writing existing element
			if (A.size() > top) {
				A.set(top, elemento);
			} else {
				A.add(elemento);
			}
		}
	}

	// Method 2
	// To return topmost element of stack
	TipoElemento top() {
		// If stack is empty
		if (top == -1) {

			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");

			return null;
		}

		// else elements are present so
		// return the topmost element
		else
			return A.get(top);
	}

	// Method 3
	// To delete last element of stack
	void pop() {
		// If stack is empty
		if (top == -1) {

			// Display message when there are no elements in
			// the stack
			System.out.println("Stack Underflow");
		}

		else

			// Delete the last element
			// by decrementing the top
			top--;
	}

	// Method 4
	// To check if stack is empty or not
	boolean empty() {
		return top == -1;
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < top; i++) {
			res += String.valueOf(A.get(i)) + "->";
		}
		res += String.valueOf(A.get(top));
		return res;
	}
}