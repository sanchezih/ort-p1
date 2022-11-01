package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._01_linkedlist._03_simplemente_enlazada_circular.src;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._01_linkedlist.LinkedList;
import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.impl.TdaNodos;

public class ListaSimplementeEnlazadaCircular<T> extends TdaNodos<T> implements LinkedList<T> {

	private Nodo<T> last;

	// Constructor
	public ListaSimplementeEnlazadaCircular() {
		this.first = null;
		this.last = null;
	}

	// Metodos
	@Override
	public int getCantidadElementos() {
		return this.getCurrentSize();
	}

	@Override
	public void addFirst(T element) {
		Nodo<T> newNode = new Nodo<T>(element);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
			newNode.next(first);
			incrementSize();
		} else {
			Nodo<T> temp = first;
			newNode.next(temp);
			first = newNode;
			last.next(first);
			incrementSize();
		}
	}

	@Override
	public void addLast(T element) {
		Nodo<T> newNode = new Nodo<T>(element);
		if (isEmpty()) {
			first = newNode;
			last = newNode;
			newNode.next(first);
			incrementSize();
		} else {
			last.next(newNode);
			last = newNode;
			last.next(first);
			incrementSize();
		}
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
				this.last = null;
			} else {
				this.first = first.next();
				this.last.next(first);
			}
			decrementSize();
		}
		return firstElement;
	}

	@Override
	public T removeLast() {
		T lastElement = null;
		if (!isEmpty()) {
			
			// Si la lista tiene solo 1 elemento
			if (this.first == this.last) {
				lastElement = this.first.getElement();
				this.first = null;
				this.last = null;
			} else {
			
				// Si la lista tiene mas de 1 elemento
				Nodo<T> temp = first;
				Nodo<T> anteultimo = null;
				while (temp.next() != first) {
					anteultimo = temp;
					temp = temp.next();
				}
				lastElement = anteultimo.next().getElement();
				anteultimo.next(first);
				this.last = anteultimo;
			}
			decrementSize();
		}
		return lastElement;
	}

	@Override
	public void addAt(T elemento, int pos) {
		Nodo<T> temp = first;
		int i;

		if (isEmpty() || (pos - 1) > getCantidadElementos()) {
			System.out.println("Index is greater than size of the list");
		} else {
			Nodo<T> newNode = new Nodo<T>(elemento);
			for (i = 1; i < pos - 1; i++) {
				temp = temp.next();
			}
			newNode.next(temp.next());
			temp.next(newNode);
			incrementSize();
		}
	}

	@Override
	public void rotar() {
		if (getCurrentSize() > 1) {
			first = first.next();
			last = last.next();
		}
	}

	@Override
	public void printForward() {
		if (!isEmpty()) {
			Nodo<T> temp = first;
			do {
				System.out.print("->[" + temp.getElement() + "]");
				temp = temp.next();
			} while (temp != first);
			System.out.printf("->\n");
		}
	}

	/**
	 * 
	 */
	public void mostrarTitulo() {
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                     LISTA SIMPLEMENTE ENLAZADA CIRCULAR                      |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();
	}

}