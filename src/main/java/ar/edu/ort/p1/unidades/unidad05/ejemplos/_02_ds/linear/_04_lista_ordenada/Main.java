package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Automovil;
import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaDeEmpleadosPorEdadAsc;
import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaDeEmpleadosPorModeloAutomovilDesc;
import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas.ListaDeEmpleadosPorNombreDesc;

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

		System.out.println("+-----------------------------------------------------------------------------+");
		System.out.println("|                  Recorro las listas y muestro su contenido                  |");
		System.out.println("+-----------------------------------------------------------------------------+");
		System.out.println();

		System.out.println("Muestro a los empleados por edad (ASC)");

		ListaDeEmpleadosPorEdadAsc listaDeEmpleadosPorEdadAsc = new ListaDeEmpleadosPorEdadAsc();
		listaDeEmpleadosPorEdadAsc.add(e1);
		listaDeEmpleadosPorEdadAsc.add(e2);
		listaDeEmpleadosPorEdadAsc.add(e3);
		listaDeEmpleadosPorEdadAsc.add(e4);

		for (Empleado empleado : listaDeEmpleadosPorEdadAsc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Muestro a los empleados por modelo de automovil (DESC)");

		ListaDeEmpleadosPorModeloAutomovilDesc listaDeEmpleadosPorModeloAutomovilDesc = new ListaDeEmpleadosPorModeloAutomovilDesc();
		listaDeEmpleadosPorModeloAutomovilDesc.add(e1);
		listaDeEmpleadosPorModeloAutomovilDesc.add(e2);
		listaDeEmpleadosPorModeloAutomovilDesc.add(e3);
		listaDeEmpleadosPorModeloAutomovilDesc.add(e4);

		for (Empleado empleado : listaDeEmpleadosPorModeloAutomovilDesc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("Muestro a los empleados alfabeticamente (DESC)");

		ListaDeEmpleadosPorNombreDesc listaDeEmpleadosPorNombreDesc = new ListaDeEmpleadosPorNombreDesc();
		listaDeEmpleadosPorNombreDesc.add(e1);
		listaDeEmpleadosPorNombreDesc.add(e2);
		listaDeEmpleadosPorNombreDesc.add(e3);
		listaDeEmpleadosPorNombreDesc.add(e4);

		for (Empleado empleado : listaDeEmpleadosPorNombreDesc) {
			System.out.println("\t-> " + empleado.toString());
		}

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("+-----------------------------------------------------------------------------+");
		System.out.println("|                Pruebo los metodos que invocan a compareByKey                |");
		System.out.println("|                usando la lista listaDeEmpleadosPorNombreDesc                |");
		System.out.println("+-----------------------------------------------------------------------------+");

		System.out.println();
		System.out.println("1. Pruebo el metodo \"exists\"");
		System.out.println("\t-> Existe Alberto?: \t" + listaDeEmpleadosPorNombreDesc.exists("Alberto"));
		System.out.println("\t-> Existe fake?: \t" + listaDeEmpleadosPorNombreDesc.exists("fake"));
		System.out.println("\t-> Existe Cristian?: \t" + listaDeEmpleadosPorNombreDesc.exists("Cristian"));

		System.out.println();
		System.out.println("2. Pruebo el metodo \"removeByKey\"");
		System.out.println("\t-> Intento remover a Alberto: \t" + listaDeEmpleadosPorNombreDesc.removeByKey("Alberto"));

		System.out.println();
		System.out.println("3. Pruebo el metodo \"search\"");
		System.out.println("\t-> Alberto: \t" + listaDeEmpleadosPorNombreDesc.search("Alberto"));
		System.out.println("\t-> fake: \t" + listaDeEmpleadosPorNombreDesc.search("fake"));
		System.out.println("\t-> Cristian: \t" + listaDeEmpleadosPorNombreDesc.search("Cristian"));

	}

}
