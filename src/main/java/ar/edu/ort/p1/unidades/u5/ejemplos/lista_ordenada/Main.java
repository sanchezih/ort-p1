package ar.edu.ort.p1.unidades.u5.ejemplos.lista_ordenada;

public class Main {

	public static void main(String[] args) {

		/* Creo una serie de empleados para luego mostrarlos de diferentes maneras. */

		Automovil a1 = new Automovil("Ford", "2018");
		Automovil a2 = new Automovil("Nissan", "2017");
		Automovil a3 = new Automovil("Renault", "2003");
		Automovil a4 = new Automovil("Renault", "2009");

		Empleado e1 = new Empleado("Zulema", 50, a1);
		Empleado e2 = new Empleado("Alberto", 53, a2);
		Empleado e3 = new Empleado("Cristian", 23, a3);
		Empleado e4 = new Empleado("Martin", 25, a4);

		/*----------------------------------------------------------------------------*/

		System.out.println("--> Muestro a los empleados por edad\n");

		ListaEmpleadosPorEdad listaEmpleadosPorEdad = new ListaEmpleadosPorEdad();
		listaEmpleadosPorEdad.add(e1);
		listaEmpleadosPorEdad.add(e2);
		listaEmpleadosPorEdad.add(e3);
		listaEmpleadosPorEdad.add(e4);

		for (Empleado empleado : listaEmpleadosPorEdad) {
			System.out.println(empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println("\n--> Muestro a los empleados alfabeticamente\n");

		ListaEmpleadosPorAlfabetica listaEmpleadosPorAlfabetica = new ListaEmpleadosPorAlfabetica();
		listaEmpleadosPorAlfabetica.add(e1);
		listaEmpleadosPorAlfabetica.add(e2);
		listaEmpleadosPorAlfabetica.add(e3);
		listaEmpleadosPorAlfabetica.add(e4);

		for (Empleado empleado : listaEmpleadosPorAlfabetica) {
			System.out.println(empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println("\n--> Muestro a los empleados por modelo de automovil\n");

		ListaEmpleadosPorModeloAutomovil listaEmpleadosPorModeloAutomovil = new ListaEmpleadosPorModeloAutomovil();
		listaEmpleadosPorModeloAutomovil.add(e1);
		listaEmpleadosPorModeloAutomovil.add(e2);
		listaEmpleadosPorModeloAutomovil.add(e3);
		listaEmpleadosPorModeloAutomovil.add(e4);

		for (Empleado empleado : listaEmpleadosPorModeloAutomovil) {
			System.out.println(empleado.toString());
		}
	}

}
