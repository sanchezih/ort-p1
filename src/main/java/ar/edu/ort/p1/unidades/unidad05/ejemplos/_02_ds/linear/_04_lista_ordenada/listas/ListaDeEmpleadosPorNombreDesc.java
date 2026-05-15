package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorNombreDesc extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 2do - 1ero
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		String nombreEmp1 = empleado1.getNombre();
		String nombreEmp2 = empleado2.getNombre();

		return nombreEmp2.compareTo(nombreEmp1);
	}

	/**
	 * 2do - 1ero
	 */
	@Override
	public int compareByKey(String nombre, Empleado empleado) {

		String nombreDelEmpleado = empleado.getNombre();

		int resultado = nombreDelEmpleado.compareTo(nombre);

		return resultado;
	}

}
