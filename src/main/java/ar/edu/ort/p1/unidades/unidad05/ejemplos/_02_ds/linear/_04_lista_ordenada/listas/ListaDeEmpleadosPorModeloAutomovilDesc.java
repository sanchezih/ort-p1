package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorModeloAutomovilDesc extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 2do - 1ero
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		String anio2 = empleado2.getAutomovil().getAnio();
		String anio1 = empleado1.getAutomovil().getAnio();

		int res = anio2.compareTo(anio1);

		return res;
	}

	/**
	 * 2do - 1ero
	 */
	@Override
	public int compareByKey(String anio, Empleado empleado) {

		String anioDelAutomovilDelEmpleado = empleado.getAutomovil().getAnio();

		int resultado = anioDelAutomovilDelEmpleado.compareTo(anio);

		return resultado;
	}

}
