package ar.edu.ort.p1.unidades.u5.ejemplos.pila.pila_strings_con_arraylist;

import java.util.ArrayList;

public class PilaStringArraylist {

	private ArrayList<String> elementos = new ArrayList<String>();

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