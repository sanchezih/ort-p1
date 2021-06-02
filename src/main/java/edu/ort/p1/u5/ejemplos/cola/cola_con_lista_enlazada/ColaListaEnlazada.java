package edu.ort.p1.u5.ejemplos.cola.cola_con_lista_enlazada;
/*
* LinkedQueue.java
*
*/

public class ColaListaEnlazada {

	class Node {
		Object elem;
		Node Next;

		public Node(Object o) {
			elem = o;
			Next = null;
		}
	}

	Node first;
	Node end;
	int size;

	public ColaListaEnlazada() {
		end = null;
		size = 0;
	}

	public void enqueue(Object o) {
		Node new_node = new Node(o);
		if (first == null) {
			first = new_node;
			end = new_node;
		} else {
			end.Next = new_node;
			end = new_node;
		}
		size++;
	}; // inserts an object onto the queue

	public Object dequeue() {
		if (first == null)
			return null;
		;
		Object o = first.elem;
		first = first.Next;
		size--;
		return o;
	} // gets the object from the queue

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}

	public Object first() {
		if (first == null)
			return null;
		else
			return first.elem;
	}

} // class LinkedQueue
