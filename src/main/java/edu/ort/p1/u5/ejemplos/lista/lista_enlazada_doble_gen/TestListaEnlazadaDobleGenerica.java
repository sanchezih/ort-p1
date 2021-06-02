package edu.ort.p1.u5.ejemplos.lista.lista_enlazada_doble_gen;

public class TestListaEnlazadaDobleGenerica {

	public static void main(String[] args) {

		ListaEnlazadaDobleGenerica<Empleado> listaDeEmpleados = new ListaEnlazadaDobleGenerica<Empleado>();

		listaDeEmpleados.add(new Empleado("Jimena", 28, "Programador"));
		Empleado employee = new Empleado("Facundo", 29, "Diseniador");
		listaDeEmpleados.add(employee);
		listaDeEmpleados.add(new Empleado("Fernanda", 21, "Product Manager"));
		listaDeEmpleados.add(new Empleado("Nicolas", 1, "Diseniador"));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Empleado("Erica", 26, "Programador"));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Empleado("Ulises", 30, "Programador"));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.deleteFirst();
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.deleteLast();
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.add(employee);
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.delete(employee);
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.delete(1);
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.deleteFirst();
		System.out.println(listaDeEmpleados);
	}

}
