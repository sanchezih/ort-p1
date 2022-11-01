package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._04_lista_ordenada.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaEmpleadosPorNombreDesc extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 
	 */
	@Override
	public int compare(Empleado elemento1, Empleado elemento2) {

		String nombreDato1 = elemento1.getNombre();
		String nombreDato2 = elemento2.getNombre();

		return nombreDato2.compareTo(nombreDato1);
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(String nombre, Empleado elemento) {

		String nombreElemento = elemento.getNombre();

		int res = nombreElemento.compareTo(nombre);

		return res;
	}

}
