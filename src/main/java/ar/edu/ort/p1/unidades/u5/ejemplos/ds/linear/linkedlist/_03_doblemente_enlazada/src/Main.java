package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._03_doblemente_enlazada.src;

public class Main {

	public static void main(String[] args) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                           LISTA DOBLEMENTE ENLAZADA                          |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

		lista.insertLast(1);
		lista.insertLast(2);
		lista.insertLast(3);
//		myLinkedlist.insertFirst(1);
		lista.insertLast(4);
		lista.insertLast(5);

		lista.printLinkedListForward();
		lista.printLinkedListBackward();

		lista.deleteFirst();

		lista.printLinkedListForward();
		lista.printLinkedListBackward();

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
