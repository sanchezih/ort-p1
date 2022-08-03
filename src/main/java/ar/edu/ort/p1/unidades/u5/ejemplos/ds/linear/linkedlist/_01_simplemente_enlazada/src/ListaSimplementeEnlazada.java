package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist.LinkedList;
import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.impl.TdaNodos;

public class ListaSimplementeEnlazada<T> extends TdaNodos<T> implements LinkedList<T> {

	private Nodo<T> last = null;

	// Constructores
	public ListaSimplementeEnlazada() {
		super();
	}

	public ListaSimplementeEnlazada(int tope) {
		super(tope);
	}

	// Metodos
	@Override
	public int getCantidadElementos() {
		return this.getCurrentSize();
	}

	@Override
	public void addFirst(T elemento) {
		checkFullness();
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (getCurrentSize() == 0) {
			this.last = this.first = nuevoNodo;
		} else {
			nuevoNodo.next(this.first);
			this.first = nuevoNodo;
		}
		incrementSize();
	}

	@Override
	public void addLast(T elemento) {
		checkFullness();
		Nodo<T> newest = new Nodo<>(elemento);
		if (isEmpty()) {
			first = newest;
		} else {
			this.last.next(newest);
		}
		last = newest;
		incrementSize();
	}

	@Override
	public T getFirst() {
		checkEmptiness();
		return this.first.getElement();
	}

	@Override
	public T getLast() {
		checkEmptiness();
		return this.last.getElement();
	}

	@Override
	public T removeFirst() {
		T firstElement = null;
		if (!isEmpty()) {
			firstElement = first.getElement();
			if (this.first == this.last) {
				this.first = null;
			} else {
				this.first = first.next();
			}
			decrementSize();
		}
		return firstElement;
	}

	@Override
	public T removeLast() {
		T lastElement = null;
		if (!isEmpty()) {
			if (this.first == this.last) {
				lastElement = this.first.getElement();
				this.first = null;
			} else {
				Nodo<T> lastNode = first;
				Nodo<T> anteultimo = null;
				while (lastNode.next() != null) {
					anteultimo = lastNode;
					lastNode = lastNode.next();
				}
				lastElement = anteultimo.next().getElement();
				anteultimo.next(null);
				this.last = anteultimo;
			}
			decrementSize();
		}
		return lastElement;
	}

	@Override
	public void addAt(T elemento, int posicion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		if (!isEmpty()) {
			String resString = "";
			Nodo<T> primerElemento = first;
			while (primerElemento.next() != null) {
				resString += String.valueOf("[" + primerElemento.getElement()) + "]->";
				primerElemento = primerElemento.next();
			}
			resString += String.valueOf("[" + primerElemento.getElement() + "]");
			System.out.println(resString);
		}
	}

	/**
	 * 
	 */
	public void mostrarTitulo() {
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                          LISTA SIMPLEMENTE ENLAZADA                          |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();
	}
}