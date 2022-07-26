package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_lista_enlazada_simple_gen.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> listaDeEnteros = new SinglyLinkedList<Integer>();

		System.out.println("listaDeEnteros...");

		listaDeEnteros.addLast(100);
		listaDeEnteros.addLast(200);
		listaDeEnteros.addLast(300);
		System.out.println(listaDeEnteros);

		listaDeEnteros.removeFirst();
		System.out.println(listaDeEnteros);

		SinglyLinkedList<Persona> listaDeEmpleados = new SinglyLinkedList<Persona>();

		System.out.println("\nlistaDeEmpleados...");

		listaDeEmpleados.addLast(new Persona("Florencia", 38));
		listaDeEmpleados.addLast(new Persona("Juan", 40));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Persona("Fernanda", 41));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addLast(new Persona("Ulises", 32));
		System.out.println(listaDeEmpleados.toString());
	}

}
