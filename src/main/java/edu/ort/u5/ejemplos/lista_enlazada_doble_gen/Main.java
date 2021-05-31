package edu.ort.u5.ejemplos.lista_enlazada_doble_gen;

import edu.ort.u5.ejemplos.common.entidades.Empleado;

public class Main {

	public static void main(String[] args) {

		ListaEnlazadaDobleGenerica<Empleado> listaDeEmpleados = new ListaEnlazadaDobleGenerica<Empleado>();

		listaDeEmpleados.add(new Empleado("Empleado_01", 28, "Programador"));
		Empleado employee = new Empleado("Empleado_02", 29, "Diseniador");
		listaDeEmpleados.add(employee);
		listaDeEmpleados.add(new Empleado("Empleado_03", 21, "Product Manager"));
		listaDeEmpleados.add(new Empleado("Empleado_04", 1, "Diseniador"));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Empleado("Empleado_05", 26, "Programador"));
		System.out.println(listaDeEmpleados);

		listaDeEmpleados.addFirst(new Empleado("Empleado_06", 30, "Programador"));
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
