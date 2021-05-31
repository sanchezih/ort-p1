package edu.ort.u5.ejemplos.lista_enlazada_doble_gen;

import edu.ort.u5.ejemplos.common.Empleado;

public class Main {

	public static void main(String[] args) {

		ListaEnlazadaDobleGenerica<Empleado> lista = new ListaEnlazadaDobleGenerica<Empleado>();

		lista.add(new Empleado("Empleado_01", 28, "Programador"));
		Empleado employee = new Empleado("Empleado_02", 29, "Diseniador");
		lista.add(employee);
		lista.add(new Empleado("Empleado_03", 21, "Product Manager"));
		lista.add(new Empleado("Empleado_04", 1, "Diseniador"));
		System.out.println(lista);

		lista.addFirst(new Empleado("Empleado_05", 26, "Programador"));
		System.out.println(lista);

		lista.addFirst(new Empleado("Empleado_06", 30, "Programador"));
		System.out.println(lista);

		lista.deleteFirst();
		System.out.println(lista);

		lista.deleteLast();
		System.out.println(lista);

		lista.add(employee);
		System.out.println(lista);

		lista.delete(employee);
		System.out.println(lista);

		lista.delete(1);
		System.out.println(lista);

		lista.deleteFirst();
		System.out.println(lista);
	}

}
