package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._05_tipos_indefinidos;

import java.util.ArrayList;

public class ListadorDeArrayLists {

	public static void main(String[] args) {

		ArrayList<Number> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(-32);
		numeros.add(14.5);

		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("hola");
		palabras.add("que");
		palabras.add("tal");

		// Invocamos a los 2 metodos para mostrar el contenido de ambas colecciones
		listarElementosConForEach(numeros);
		listarElementosConForEach(palabras);

		listarElementosSinUsarObject(numeros);
		listarElementosSinUsarObject(palabras);
	}

	// Tener en cuenta:
	// 1. Al hacer esto, dentro del metodo no podremos acceder a los métodos propios
	// del elemento manipulado.
	// 2. Si tuviésemos que devolver un elemento, el tipo declarado no puede ser
	// otro que Object.

	private static void listarElementosConForEach(ArrayList<?> lista) {
		for (Object objeto : lista) {
			System.out.println(objeto);
		}
	}

	private static void listarElementosSinUsarObject(ArrayList<?> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}