package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_arraylist_string.src;

import java.util.ArrayList;

import ar.edu.ort.tp1.u5.tda.Pila;

public class PilaStringArraylist implements Pila<String> {

	private ArrayList<String> elementos;

	// Constructor
	public PilaStringArraylist() {
		this.elementos = new ArrayList<String>();
	}

	@Override
	public int count() {
		return elementos.size();
	}

	@Override
	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkFullness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void push(String element) {
		elementos.add(element);
	}

	@Override
	public String pop() {
		String res = null;
		if (!elementos.isEmpty()) {
			res = elementos.get(elementos.size() - 1);
			elementos.remove(elementos.size() - 1);
		}
		return res;
	}

	@Override
	public String peek() {
		String res = null;
		if (!elementos.isEmpty()) {
			res = elementos.get(elementos.size() - 1);
		}
		return res;
	}
	@Override
	public String toString() {
		return "PilaStringArraylist [listaDeElementos=" + elementos + "]";
	}
}