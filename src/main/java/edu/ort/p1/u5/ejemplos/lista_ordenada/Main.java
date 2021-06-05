package edu.ort.p1.u5.ejemplos.lista_ordenada;

public class Main {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Zulema", 50);
		Empleado e2 = new Empleado("Alberto", 53);
		Empleado e3 = new Empleado("Cristian", 23);
		Empleado e4 = new Empleado("Martin", 25);

		ListaEmpleadosPorEdad listaEmpleadosPorEdad = new ListaEmpleadosPorEdad();

		listaEmpleadosPorEdad.add(e1);
		listaEmpleadosPorEdad.add(e2);
		listaEmpleadosPorEdad.add(e3);
		listaEmpleadosPorEdad.add(e4);

		for (Empleado empleado : listaEmpleadosPorEdad) {
			System.out.println(empleado.toString());
		}

		System.out.println();

		ListaEmpleadosPorAlfabetica ListaEmpleadosPorAlfabetica = new ListaEmpleadosPorAlfabetica();
		ListaEmpleadosPorAlfabetica.add(e1);
		ListaEmpleadosPorAlfabetica.add(e2);
		ListaEmpleadosPorAlfabetica.add(e3);
		ListaEmpleadosPorAlfabetica.add(e4);

		for (Empleado empleado : ListaEmpleadosPorAlfabetica) {
			System.out.println(empleado.toString());
		}
	}

}
