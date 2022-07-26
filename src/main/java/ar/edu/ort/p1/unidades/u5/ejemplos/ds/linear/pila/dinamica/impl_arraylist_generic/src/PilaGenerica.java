package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_arraylist_generic.src;

import java.util.ArrayList;

import ar.edu.ort.tp1.u5.tda.Pila;

public class PilaGenerica<T> implements Pila<T> {
	private ArrayList<T> elementos;
	private int top = -1;
	private int tamanio;
	

	// Constructores
	public PilaGenerica() {
		this.tamanio = 0;
		this.elementos = new ArrayList<T>(tamanio);
	}

	public PilaGenerica(int tamanio) {
		this.tamanio = tamanio;
		this.elementos = new ArrayList<T>(tamanio);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
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
	public void push(T element) {
		if (top + 1 == tamanio) {
			System.out.println("Stack Overflow");
		} else {
			top = top + 1;
			if (elementos.size() > top) {
				elementos.set(top, element);
			} else {
				elementos.add(element);
			}
		}
		
	}

	@Override
	public T pop() {
		if (top == -1) { // If stack is empty
			System.out.println("Stack Underflow");
		} else {

			// Delete the last element by decrementing the top
			top--;
		}
		return null; // TODO: ver el tipo de dato de retorno
	}

	@Override
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