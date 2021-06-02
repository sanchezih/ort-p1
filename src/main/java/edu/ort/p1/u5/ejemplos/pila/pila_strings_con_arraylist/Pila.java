package edu.ort.p1.u5.ejemplos.pila.pila_strings_con_arraylist;

import java.util.ArrayList;

public class Pila {

	private ArrayList<String> elementos = new ArrayList<>();

	public String peek() {
		if (elementos.isEmpty()) {
			return null;
		}
		return elementos.get(elementos.size() - 1);
	}

	public String pop() {
		if (elementos.isEmpty()) {
			return null;
		}
		String top = elementos.get(elementos.size() - 1);
		elementos.remove(elementos.size() - 1);
		return top;
	}

	public void push(String elemento) {
		elementos.add(elemento);
	}

	public int size() {
		return elementos.size();
	}

	public boolean isEmpty() {
		return elementos.isEmpty();
	}

	@Override
	public String toString() {
		return "Pila [elements=" + elementos + "]";
	}
}