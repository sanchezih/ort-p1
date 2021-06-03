package edu.ort.p1.u5.ejemplos.cola.cola_con_lista_enlazada;

public class ColaListaEnlazada {

	private Nodo first;
	private Nodo last;
	private int size;

	public ColaListaEnlazada() {
		last = null;
		size = 0;
	}

	// Inserta un objeto en la cola
	public void add(Object o) {
		Nodo new_node = new Nodo(o);
		if (first == null) {
			first = new_node;
			last = new_node;
		} else {
			last.Next = new_node;
			last = new_node;
		}
		size++;
	}

	// Remueve un objeto de la cola
	public Object remove() {
		if (first == null)
			return null;

		Object o = first.elem;
		first = first.Next;
		size--;
		return o;
	}

	public Object get() {
		if (first == null)
			return null;
		else
			return first.elem;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}
}