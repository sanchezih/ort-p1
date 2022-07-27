package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_linkedlist.src;

import static java.lang.System.exit;

import ar.edu.ort.tp1.u5.tda.Pila;
import ar.edu.ort.tp1.u5.tda.nodos.Nodo;
import ar.edu.ort.tp1.u5.tda.nodos.TdaNodos;

public class StackUsingLinkedlist<T> extends TdaNodos<T> implements Pila<T> {

	private Nodo<T> end;
	private int tamanio;

	public StackUsingLinkedlist() {
		end = null;
		tamanio = 0;
	}

	@Override
	public int count() {
		return tamanio;
	}

	@Override
	public boolean isEmpty() {
		return (tamanio == 0);
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
		Nodo<T> nuevoNodo = new Nodo<T>(element);
		if (end == null)
			end = nuevoNodo;
		else {
			nuevoNodo.next(end);
			end = nuevoNodo;
		}
		tamanio++;
	}

	@Override
	public T pop() {
		T elemento = null;

		if (end != null) {
			elemento = end.getElement();
			end = end.next();
			tamanio--;
		}
		return elemento;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return end.getElement();
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}

	public T end() {
		T res = null;
		if (end != null) {
			res = end.getElement();
		}
		return res;
	}

	public void display() {
		// check for stack underflow
		if (end == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Nodo<T> temp = end;
			while (temp != null) {

				// print node data
				System.out.print(" -> " + temp.getElement());

				// assign temp link to temp
				temp = temp.next();
			}
		}
	}

}