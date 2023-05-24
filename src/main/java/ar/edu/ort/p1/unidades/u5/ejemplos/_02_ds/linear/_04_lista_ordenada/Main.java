package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada;

import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Automovil;
import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaEmpleadosPorEdad;
import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaEmpleadosPorModeloAutomovilDesc;
import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaEmpleadosPorNombreDesc;

public class Main {

	public static void main(String[] args) {

		// Creo una serie de empleados para luego mostrarlos de diferentes maneras

		Automovil a1 = new Automovil("Ford", "2018");
		Automovil a2 = new Automovil("Nissan", "2017");
		Automovil a3 = new Automovil("Renault", "2003");
		Automovil a4 = new Automovil("Renault", "2009");

		Empleado e1 = new Empleado("Zulema", 50, a1);
		Empleado e2 = new Empleado("Alberto", 53, a2);
		Empleado e3 = new Empleado("Cristian", 23, a3);
		Empleado e4 = new Empleado("Martin", 25, a4);

		/*----------------------------------------------------------------------------*/

		System.out.println("Muestro a los empleados por edad (ASC)");

		ListaEmpleadosPorEdad listaEmpleadosPorEdadAsc = new ListaEmpleadosPorEdad();
		listaEmpleadosPorEdadAsc.add(e1);
		listaEmpleadosPorEdadAsc.add(e2);
		listaEmpleadosPorEdadAsc.add(e3);
		listaEmpleadosPorEdadAsc.add(e4);

		for (Empleado empleado : listaEmpleadosPorEdadAsc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Muestro a los empleados por modelo de automovil (DESC)");

		ListaEmpleadosPorModeloAutomovilDesc listaEmpleadosPorModeloAutomovilDesc = new ListaEmpleadosPorModeloAutomovilDesc();
		listaEmpleadosPorModeloAutomovilDesc.add(e1);
		listaEmpleadosPorModeloAutomovilDesc.add(e2);
		listaEmpleadosPorModeloAutomovilDesc.add(e3);
		listaEmpleadosPorModeloAutomovilDesc.add(e4);

		for (Empleado empleado : listaEmpleadosPorModeloAutomovilDesc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Muestro a los empleados alfabeticamente (DESC)");

		ListaEmpleadosPorNombreDesc listaEmpleadosPorAlfabeticaDesc = new ListaEmpleadosPorNombreDesc();
		listaEmpleadosPorAlfabeticaDesc.add(e1);
		listaEmpleadosPorAlfabeticaDesc.add(e2);
		listaEmpleadosPorAlfabeticaDesc.add(e3);
		listaEmpleadosPorAlfabeticaDesc.add(e4);

		for (Empleado empleado : listaEmpleadosPorAlfabeticaDesc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Busco empleados");

		System.out.println("\t-> Alberto: \t" + listaEmpleadosPorAlfabeticaDesc.search("Alberto"));
		System.out.println("\t-> noexiste: \t" + listaEmpleadosPorAlfabeticaDesc.search("noexiste"));
		System.out.println("\t-> Cristian: \t" + listaEmpleadosPorAlfabeticaDesc.search("Cristian"));

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Busco autos por anio");

		System.out.println("\t-> 2018: \t" + listaEmpleadosPorModeloAutomovilDesc.search("2018"));
		System.out.println("\t-> 2009: \t" + listaEmpleadosPorModeloAutomovilDesc.search("2009"));
		System.out.println("\t-> 2003: \t" + listaEmpleadosPorModeloAutomovilDesc.search("2003"));
		System.out.println("\t-> 2020: \t" + listaEmpleadosPorModeloAutomovilDesc.search("2020"));

	}

}
