package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._01_linkedlist._02_doblemente_enlazada.src;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._01_linkedlist.LinkedList;
import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.impl.NodoLista;

public class ListaDoblementeEnlazada<T> implements LinkedList<T> {
	private NodoLista<T> head;
	private NodoLista<T> tail;
	int currentSize;

	// Constructores
	public ListaDoblementeEnlazada() {
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
	}

	// Metodos
	@Override
	public boolean isEmpty() {
		return this.currentSize == 0;
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
	public int getCantidadElementos() {
		return currentSize;
	}

	@Override
	public void addFirst(T elemento) {
		NodoLista<T> newNode = new NodoLista<>(elemento);
		newNode.next(head);
		newNode.previous(null);

		if (head != null) {
			head.previous(newNode);
		}
		head = newNode;
		if (tail == null) {
			tail = newNode;
		}
		currentSize++;
	}

	@Override
	public void addLast(T elemento) {

	}

	@Override
	public T getFirst() {
		return this.head.getElement();
	}

	@Override
	public T getLast() {
		return this.tail.getElement();
	}

	@Override
	public T removeFirst() {
		if (currentSize == 0) {
			throw new RuntimeException("Doubly linked list is already empty");
		}
		NodoLista<T> temp = head;
		head = (NodoLista<T>) head.next();
		head.previous(null);
		currentSize--;
		return temp.getElement();
	}

	@Override
	public T removeLast() {
		NodoLista<T> temp = tail;
		tail = tail.previous();
		tail.next(null);
		currentSize--;
		return temp.getElement();
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
	public void printForward() {
		System.out.println("Se imprime la lista desde head->tail");
		String res = "";
		Nodo<T> current = head;
		while (current != null) {
			res += "<-[" + current.getElement() + "]->";
			current = current.next();
		}
		System.out.println(res);
	}

	public void printBackward() {
		System.out.println("Se imprime la lista desde tail->head");
		String res = "";
		NodoLista<T> current = tail;
		while (current != null) {
			res += "<-[" + current.getElement() + "]->";
			current = current.previous();
		}
		System.out.println(res);
	}

	/**
	 * 
	 */
	public void mostrarTitulo() {
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                           LISTA DOBLEMENTE ENLAZADA                          |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();
	}
}