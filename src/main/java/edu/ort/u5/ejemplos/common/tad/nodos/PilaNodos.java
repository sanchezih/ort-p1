package edu.ort.u5.ejemplos.common.tad.nodos;

import edu.ort.u5.ejemplos.common.tad.Pila;

public class PilaNodos<TipoElemento> implements Pila<TipoElemento> {

	private Nodo<TipoElemento> tope;
	private int limite;
	private int cantidad;

	public PilaNodos() {
		this(SIN_LIMITE);
	}

	public PilaNodos(int limite) {
		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalArgumentException(ERR_TAM_PILA_ILEGAL);
		}
		this.limite = limite;
		this.tope = null;
		this.cantidad = 0;
	}

	@Override
	public void push(TipoElemento elemento) {
		if (isFull()) {
			throw new RuntimeException(ERR_PILA_LLENA);
		}
		Nodo<TipoElemento> nuevoNodo = new Nodo<TipoElemento>(elemento);
		nuevoNodo.setNext(tope);
		tope = nuevoNodo;
		cantidad++;
	}

	@Override
	public TipoElemento pop() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_PILA_VACIA);
		}
		Nodo<TipoElemento> aux = tope;
		tope = tope.getNext();
		cantidad--;
		return aux.getDato();
	}

	@Override
	public TipoElemento peek() {
		if (isEmpty()) {
			throw new RuntimeException(ERR_PILA_VACIA);
		}
		return tope.getDato();
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