package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_lista_enlazada_simple_gen.src;

public class Node<E> {

	private E element; // reference to the element stored at this node
	private Node<E> next; // reference to the subsequent node in the list

	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}

	public E getElement() {
		return element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> n) {
		next = n;
	}
}