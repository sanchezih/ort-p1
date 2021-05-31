package edu.ort.u5.ejemplos.lista_enlazada_simple_gen;

public class Main {

	public static void main(String[] args) {

		ListaEnlazadaSimpleGenerica<Integer> list1 = new ListaEnlazadaSimpleGenerica<>();
		System.out.println("Integer LinkedList created as list1 :");

		// Adding elements to the above List object

		// Element 1 - 100
		list1.add(100);
		// Element 2 - 200
		list1.add(200);
		// Element 3 - 300
		list1.add(300);

		// Display message only
		System.out.println("list1 after adding 100,200 and 300 :");

		// Print and display the above List elements
		System.out.println(list1);

		// Removing 200 from list1
		list1.remove(200);

		// Display message only
		System.out.println("list1 after removing 200 :");

		// Print and display again updaed List elements
		System.out.println(list1);

		// String LinkedList

		// Creating new empty String linked list
		ListaEnlazadaSimpleGenerica<String> list2 = new ListaEnlazadaSimpleGenerica<>();
		System.out.println("\nString LinkedList created as list2");
		// Adding elements to the above List object

		// Element 1 - hello
		list2.add("hello");

		// Element 2 - world
		list2.add("world");

		// Display message only
		System.out.println("list2 after adding hello and world :");

		// Print current elements only
		System.out.println(list2);

		// Now, adding element 3- "GFG" at position 2
		list2.add(2, "GFG");

		// Display message only
		System.out.println("list2 after adding GFG at postion 2 :");

		// now print the updated List again
		// after inserting element at second position
		System.out.println(list2);

		// Float LinkedList

		// Creating new empty Float linked list
		ListaEnlazadaSimpleGenerica<Float> list3 = new ListaEnlazadaSimpleGenerica<>();

		// Display message only
		System.out.println("\nFloat LinkedList created as list3");

		// Adding elements to the above List

		// Element 1 - 20.25
		list3.add(20.25f);
		// Element 2 - 50.42
		list3.add(50.42f);
		// Element 3 - 30.99
		list3.add(30.99f);

		// Display message only
		System.out.println("list3 after adding 20.25, 50.42 and 30.99 :");

		// Print and display List elements
		System.out.println(list3);

		// Display message only
		System.out.println("Clearing list3 :");

		// Now.clearing this lisy using clear() method
		list3.clear();

		// Now, print and display the aboce list again
		System.out.println(list3);
	}
}