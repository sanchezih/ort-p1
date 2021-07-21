package ar.edu.ort.p1.u5.ejemplos.lista._01_lista_enlazada_simple_gen;

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

		System.out.println("\nlistaDeEmpleados...");

		listaDeEmpleados.addLast(new Empleado("Florencia", 38));
		listaDeEmpleados.addLast(new Empleado("Juan", 40));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Empleado("Fernanda", 41));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addLast(new Empleado("Ulises", 32));
		System.out.println(listaDeEmpleados.toString());
	}

}
