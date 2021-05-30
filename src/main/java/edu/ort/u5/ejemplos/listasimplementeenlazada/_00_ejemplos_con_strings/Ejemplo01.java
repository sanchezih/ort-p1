package edu.ort.u5.ejemplos.listasimplementeenlazada._00_ejemplos_con_strings;

import java.util.Iterator;
import java.util.LinkedList;

public class Ejemplo01 {
	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the Linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		list.add("Negan");
		list.add("Rick");

		// Removing First element
		// Same as list.remove(0);
		list.removeFirst();

		// Removing Last element
		list.removeLast();

		// Iterating LinkedList
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// removing 2nd element, index starts with 0
		list.remove(1);

		System.out.print("\nAfter removing second element: ");
		// Iterating LinkedList again
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
	}
}
