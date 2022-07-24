package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_arraylist_string.src;

import java.util.ArrayList;

public class PilaStringArraylist {

	private ArrayList<String> elementos;

	// Constructor
	public PilaStringArraylist() {
		this.elementos = new ArrayList<String>();
	}

	// Metodos
	public void push(String elemento) {
		elementos.add(elemento);
	}

	public String pop() {
		String res = null;
		if (!elementos.isEmpty()) {
			res = elementos.get(elementos.size() - 1);
			elementos.remove(elementos.size() - 1);
		}
		return res;
	}

	public String peek() {
		String res = null;
		if (!elementos.isEmpty()) {
			res = elementos.get(elementos.size() - 1);
		}
		return res;
	}

	public int size() {
		return elementos.size();
	}

	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public String toString() {
		return "PilaStringArraylist [listaDeElementos=" + elementos + "]";
	}

}