package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaEmpleadosPorEdad extends ListaOrdenadaNodos<Integer, Empleado> {

	/**
	 * Se utiliza para comparar dos elementos entre si.
	 * 
	 * Este metodo es invocado al momento de insertar un elemento en la lista.
	 * 
	 * Si trabajo con una lista ordenada ASC: param1 - param2
	 * 
	 * Si trabajo con una lista ordenada DESC: param2 - param1
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		int edadEmpleado1 = empleado1.getEdad();
		int edadEmpleado2 = empleado2.getEdad();

		int res = edadEmpleado1 - edadEmpleado2;

		return res;
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(Integer clave, Empleado empleado) {

		int edadEmpleado = empleado.getEdad();

		return clave - edadEmpleado;
	}

}
