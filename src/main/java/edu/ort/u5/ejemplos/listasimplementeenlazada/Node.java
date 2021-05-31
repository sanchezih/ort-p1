package edu.ort.u5.ejemplos.listasimplementeenlazada;
//Class 1
//Helper Class (Generic node class for LinkedList)
public class Node<T> {

	// Data members
	// 1. Storing value of node
	T data;
	// 2. Storing address of next node
	Node<T> next;

	// Parameterized constructor to assign value
	Node(T data) {

		// This keyword refers to current object itself
		this.data = data;
		this.next = null;
	}
}