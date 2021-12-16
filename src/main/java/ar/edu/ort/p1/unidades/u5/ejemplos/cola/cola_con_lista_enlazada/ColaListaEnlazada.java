package ar.edu.ort.p1.unidades.u5.ejemplos.cola.cola_con_lista_enlazada;

public class ColaListaEnlazada {

	private Nodo first;
	private Nodo last;
	private int size;

	public ColaListaEnlazada() {
		last = null;
		size = 0;
	}

	public void add(Object o) {

		Nodo nuevoNodo = new Nodo(o);
		if (first == null) {
			first = nuevoNodo;
			last = nuevoNodo;
		} else {
			last.next = nuevoNodo;
			last = nuevoNodo;
		}
		size++;
	}

	public Object remove() {
		if (first == null)
			return null;

		Object o = first.elemento;
		first = first.next;
		size--;
		return o;
	}

	public Object get() {
		if (first == null)
			return null;
		else
			return first.elemento;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}

}