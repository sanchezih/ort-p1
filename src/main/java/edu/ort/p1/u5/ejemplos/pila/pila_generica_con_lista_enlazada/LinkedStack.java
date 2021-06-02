package edu.ort.p1.u5.ejemplos.pila.pila_generica_con_lista_enlazada;

public class LinkedStack<TipoElemento> {

	private Nodo<TipoElemento> end;
	private int tamanio;

	public LinkedStack() {
		end = null;
		tamanio = 0;
	}

	public void push(TipoElemento elemento) {
		Nodo<TipoElemento> nuevoNodo = new Nodo<TipoElemento>(elemento);
		if (end == null)
			end = nuevoNodo;
		else {
			nuevoNodo.setNext(end);
			end = nuevoNodo;
		}
		tamanio++;
	};

	public TipoElemento pop() {
		TipoElemento elemento = null;

		if (end != null) {
			elemento = end.getElemento();
			end = end.getNext();
			tamanio--;
		}
		return elemento;
	}

	public boolean isEmpty() {
		return (tamanio == 0);
	}

	public int size() {
		return tamanio;
	}

	public TipoElemento end() {
		TipoElemento res = null;
		if (end != null) {
			res = end.getElemento();
		}
		return res;
	}
}