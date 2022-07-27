package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._03_doblemente_enlazada.src;

import ar.edu.ort.tp1.u5.tda.nodos.Nodo;
import ar.edu.ort.tp1.u5.tda.nodos.NodoLista;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList myLinkedlist = new DoublyLinkedList();

		myLinkedlist.insertLast(1);
		myLinkedlist.insertLast(2);
		myLinkedlist.insertLast(3);
//		myLinkedlist.insertFirst(1);
		myLinkedlist.insertLast(4);
		myLinkedlist.insertLast(5);

		myLinkedlist.printLinkedListForward();
		myLinkedlist.printLinkedListBackward();

		myLinkedlist.deleteFirst();

		myLinkedlist.printLinkedListForward();
		myLinkedlist.printLinkedListBackward();

		System.out.println("================");
		// Doubly Linked list will be
		// 1 -> 7 -> 6 -> 5 -> 2

		// NodoLista node = new NodoLista<>(1);
//		node.data = 1;

		// myLinkedlist.deleteAfter(node);
//		myLinkedlist.printLinkedListForward();
//		myLinkedlist.printLinkedListBackward();
//		// After deleting node after 1,doubly Linked list will be
//		// 2 -> 1 -> 6 -> 5
//		System.out.println("================");
//		myLinkedlist.deleteFirst();
//		myLinkedlist.deleteLast();
//
//		// After performing above operation, doubly Linked list will be
//		// 6 -> 5
//		myLinkedlist.printLinkedListForward();
//		myLinkedlist.printLinkedListBackward();

	}

}
