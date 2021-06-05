package edu.ort.p1.u5.ejemplos.lista._01_lista_enlazada_simple_gen;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList<Integer> listaDeEnteros = new SinglyLinkedList<Integer>();

		System.out.println("listaDeEnteros...");
		
		listaDeEnteros.addLast(100);
		listaDeEnteros.addLast(200);
		listaDeEnteros.addLast(300);
		System.out.println(listaDeEnteros);

		listaDeEnteros.removeFirst();
		System.out.println(listaDeEnteros);
		
		
		
		SinglyLinkedList<Empleado> listaDeEmpleados = new SinglyLinkedList<Empleado>();

		listaDeEmpleados.addFirst(new Empleado("Florencia", 38));
		listaDeEmpleados.addFirst(new Empleado("Juan", 40));
		
		
	}

}
