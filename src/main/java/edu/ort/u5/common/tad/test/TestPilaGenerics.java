package edu.ort.u5.common.tad.test;

import edu.ort.u5.common.tad.Pila;
import edu.ort.u5.common.tad.nodos.PilaNodos;

public class TestPilaGenerics {

	public static void main(String[] args) {
		System.out.println("PROBANDO UNA PILA (Nodos) DE ENTEROS");
		Pila<Integer> pilaEnteros;
		pilaEnteros = new PilaNodos<>();
		pilaEnteros.push(1);
		mostrarEstado(pilaEnteros);
		System.out.println("elemento devuelto: " + pilaEnteros.pop());
		mostrarEstado(pilaEnteros);

		System.out.println();
		System.out.println("PROBANDO UNA PILA (ArrayList) DE STRINGS");
		Pila<String> pilaStrings;

		pilaStrings = new PilaNodos<>();
		pilaStrings.push("hola");
		pilaStrings.push("que");
		pilaStrings.push("tal");
		mostrarEstado(pilaStrings);
		while (!pilaStrings.isEmpty()) {
			System.out.println("elemento devuelto: " + pilaStrings.pop());
			mostrarEstado(pilaStrings);
		}
	}

	// Con el <?> se indica que se desconoce el tipo elemento de la pila
	private static void mostrarEstado(Pila<?> pila) {
		System.out.println("\tImplementacion elegida: " + pila.getClass().getSimpleName());
		System.out.println("\testa vacia? " + pila.isEmpty());
		System.out.println("\testa llena? " + pila.isFull());
		System.out.print("\tque hay en el tope? ");
		if (!pila.isEmpty()) {
			System.out.println(" " + pila.peek());
		} else {
			System.out.println(" No hay nada en esta pobre pila, snif... ='(");
		}
	}
}