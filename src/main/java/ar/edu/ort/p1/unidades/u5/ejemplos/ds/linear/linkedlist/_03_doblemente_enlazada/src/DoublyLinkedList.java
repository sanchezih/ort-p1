package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._03_doblemente_enlazada.src;

import ar.edu.ort.tp1.u5.tda.impl.Nodo;
import ar.edu.ort.tp1.u5.tda.impl.NodoLista;

public class DoublyLinkedList<T> {

	private NodoLista<T> head;
	private NodoLista<T> tail;
	int size;

	public boolean isEmpty() {
		return (head == null);
	}

	/**
	 * Used to insert a node at the start of linked list
	 * 
	 * @param data
	 */
	public void insertFirst(T data) {
		NodoLista<T> newNode = new NodoLista<>(data);
		newNode.next(head);
		newNode.previous(null);
		if (head != null) {
			head.previous(newNode);
		}
		head = newNode;
		if (tail == null) {
			tail = newNode;
		}
		size++;
	}

	/**
	 * Used to insert a node at the start of linked list
	 * 
	 * @param data
	 */
	public void insertLast(T data) {
		NodoLista<T> newNode = new NodoLista<>(data);
		newNode.next(null);
		newNode.previous(tail);
		if (tail != null) {
			tail.next(newNode);
		}
		tail = newNode;
		if (head == null)
			head = newNode;
		size++;
	}

	/**
	 * Used to delete node from start of Doubly linked list
	 * 
	 * @return
	 */
	public NodoLista<T> deleteFirst() {

		if (size == 0)
			throw new RuntimeException("Doubly linked list is already empty");

		NodoLista<T> temp = head;
		head = (NodoLista<T>) head.next();
		head.previous(null);
		size--;
		return temp;
	}

	// used to delete node from last of Doubly linked list
	public NodoLista<T> deleteLast() {
		NodoLista<T> temp = tail;
		tail = tail.previous();
		tail.next(null);
		size--;
		return temp;
	}

//
//	// Use to delete node after particular node
//	public void deleteAfter(Nodo after) {
//		Nodo temp = head;
//		while (temp.next != null && temp.data != after.data) {
//			temp = temp.next;
//		}
//		if (temp.next != null)
//			temp.next.next.prev = temp;
//		temp.next = temp.next.next;
//
//	}
//
	/**
	 * For printing Doubly Linked List forward
	 */
	public void printLinkedListForward() {
		System.out.println("Printing Doubly LinkedList (head --> tail) ");

		// Nodo current = head;
		Nodo<T> current = head;

		while (current != null) {
			System.out.println("{ " + current.getElement() + " } ");
			current = current.next();
		}
		System.out.println();
	}

	/**
	 * For printing Doubly Linked List forward
	 */
	public void printLinkedListBackward() {
		System.out.println("Printing Doubly LinkedList (tail --> head) ");
		NodoLista<T> current = tail;
		while (current != null) {
			System.out.println("{ " + current.getElement() + " } ");
			// current.displayNodeData();
			current = current.previous();
		}
		System.out.println();
	}

}