package ar.edu.ort.p1.u5.ejemplos.lista._02_lista_enlazada_doble_gen;

public class TestDoublyLinkedList {

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
