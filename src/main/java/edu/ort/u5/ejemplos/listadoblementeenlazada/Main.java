package edu.ort.u5.ejemplos.listadoblementeenlazada;

public class Main {

	public static void main(String[] args) {

		GenericDoublyLinkedList<Empleado> lista = new GenericDoublyLinkedList<Empleado>();
		lista.add(new Empleado("Empleado_01", 28, "Programador"));
		lista.add(new Empleado("Empleado_02", 29, "Diseniador"));
		lista.add(new Empleado("Empleado_03", 21, "Product Manager"));
		lista.add(new Empleado("Empleado_04", 1, "Diseniador"));
		System.out.println(lista);

		lista.addFirst(new Empleado("Empleado_05", 26, "Programador"));
		System.out.println(lista);

		lista.deleteFirst();
		System.out.println(lista);

		lista.deleteLast();
		System.out.println(lista);

		Empleado employee = new Empleado("Eployee_02", 25, "Diseniador");
		System.out.println(lista);

		lista.delete(employee);
		
		System.out.println(lista);

		// lista.delete(1);
		// System.out.println(lista);

		// lista.deleteFirst();
		// System.out.println(lista);
	}

}
