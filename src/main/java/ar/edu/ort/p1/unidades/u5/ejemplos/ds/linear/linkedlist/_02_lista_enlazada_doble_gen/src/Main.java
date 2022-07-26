package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._02_lista_enlazada_doble_gen.src;

import ar.edu.ort.p1.util.pojo.Persona;

/**
 * https://cs.fit.edu/~pkc/classes/ds/java/src/net/datastructures/DoublyLinkedList.java
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> listaDeEnteros = new DoublyLinkedList<Integer>();

		System.out.println("listaDeEnteros...");

		listaDeEnteros.addLast(10);
		listaDeEnteros.addLast(45);
		listaDeEnteros.addLast(57);
		listaDeEnteros.printNodes();

		DoublyLinkedList<Persona> listaDeEmpleados = new DoublyLinkedList<Persona>();
		System.out.println("\nlistaDeEmpleados...");
		listaDeEmpleados.addLast(new Persona("Ignacio", 36));
		listaDeEmpleados.addLast(new Persona("Noelia", 36));
		listaDeEmpleados.printNodes();

	}
}
