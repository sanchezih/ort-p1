package edu.ort.u5.ejemplos.common.tad.nodos;

import edu.ort.u5.ejemplos.common.tad.Cola;

public class ColaNodos<TipoElemento> implements Cola<TipoElemento> {

	private Nodo<TipoElemento> primero;
	private Nodo<TipoElemento> ultimo;
	private int limite;
	private int cantidad;

	public ColaNodos() {
		this(SIN_LIMITE);
	}

	public ColaNodos(int limite) {
		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_ILEGAL);
		}
		this.limite = limite;
		this.primero = null;
		this.ultimo = null;
		this.cantidad = 0;
	}

	@Override
	public void add(TipoElemento elemento) {
		if (isFull()) {
			throw new RuntimeException(ERR_COLA_LLENA);
		}
		Nodo<TipoElemento> nuevoNodo = new Nodo<TipoElemento>(elemento);
		if (isEmpty()) {
			primero = nuevoNodo;
		} else {
			ultimo.setNext(nuevoNodo);
		}
		ultimo = nuevoNodo;
		cantidad++;
	}

	@Override
	public TipoElemento remove() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_COLA_VACIA);
		}
		Nodo<TipoElemento> aux = primero;
		primero = primero.getNext();
		cantidad--;
		return aux.getDato();
	}

	@Override
	public TipoElemento get() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_COLA_VACIA);
		}
		return primero.getDato();
	}

	@Override
	public boolean isEmpty() {
		return cantidad == 0;
	}

	@Override
	public boolean isFull() {
		return cantidad == limite;
	}
}