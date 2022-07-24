package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._02_lista_enlazada_doble_gen.src;

import ar.edu.ort.p1.util.pojo.Empleado;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> listaDeEnteros = new DoublyLinkedList<Integer>();

		System.out.println("listaDeEnteros...");

		listaDeEnteros.addLast(10);
		listaDeEnteros.addLast(45);
		listaDeEnteros.addLast(57);
		listaDeEnteros.printNodes();

		DoublyLinkedList<Empleado> listaDeEmpleados = new DoublyLinkedList<Empleado>();
		System.out.println("\nlistaDeEmpleados...");
		listaDeEmpleados.addLast(new Empleado("Ignacio", 36));
		listaDeEmpleados.addLast(new Empleado("Noelia", 36));
		listaDeEmpleados.printNodes();

	}
}
