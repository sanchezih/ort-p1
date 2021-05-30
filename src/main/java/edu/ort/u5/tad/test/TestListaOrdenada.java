package edu.ort.u5.tad.test;

import edu.ort.u5.tad.ListaOrdenada;
import edu.ort.u5.tad.test.entidades.Empleado;

public class TestListaOrdenada {

	// Declaro las dos listas con las que voy a querer mantener ordenados los
	// empleados.
	private static ListaOrdenada<Integer, Empleado> listaPorLegajo;
	private static ListaOrdenada<String, Empleado> listaPorNombre;

	public static void main(String[] args) {
		// Inicializo ambas clases
		listaPorLegajo = new EmpleadosPorLegajo();
		listaPorNombre = new EmpleadosPorNombre();

		// Agrego los empleados a ambas listas
		agregarEmpleado(5, "Sebastian");
		agregarEmpleado(3, "Mariano");
		agregarEmpleado(7, "Nir");
		agregarEmpleado(1, "Gaby");
		agregarEmpleado(2, "Dany");
		agregarEmpleado(4, "Carlos");
		agregarEmpleado(8, "Sebastian");

		// listo los empleados ordenados de dos formas distintas (por legajo y por
		// nombre)
		listar(listaPorLegajo);
		listar(listaPorNombre);

		// Elimino a uno de los empleados de una de las listas
		System.out.println("Eliminando a Dany de la lista por legajo...");
		Empleado e = listaPorLegajo.remove(new Integer(2));

		// muestro el empleado removido
		System.out.println("Se removio a " + e);

		System.out.println("Sin embargo, el empleado 'sobrevive' en la lista por nombre");
		listar(listaPorLegajo);
		listar(listaPorNombre);

		// lo removemos de la segunda lista y volvemos a mostrar la lista por nombre
		System.out.println("Eliminando a Dany de la lista por nombre...");
		e = listaPorNombre.search("Dany");
		listaPorNombre.remove(e);

		// muestro el empleado removido
		System.out.println("Se removio a " + e);

		listar(listaPorNombre);
	}

	private static void listar(ListaOrdenada<?, Empleado> lista) {
		System.out.println(String.join(" ", lista.getClass().getSimpleName().split("(?=\\p{Upper})")));
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
	}

	private static void agregarEmpleado(int legajo, String nombre) {
		System.out.println("Agrego " + legajo + " - " + nombre + " en ambas listas");
		Empleado e = new Empleado(legajo, nombre);
		listaPorLegajo.add(e);
		listaPorNombre.add(e);
	}

}