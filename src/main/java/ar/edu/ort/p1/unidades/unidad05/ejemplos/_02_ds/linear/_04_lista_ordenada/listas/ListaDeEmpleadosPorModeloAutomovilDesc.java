package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorModeloAutomovilDesc extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		String anio2 = empleado2.getAutomovil().getAnio();
		String anio1 = empleado1.getAutomovil().getAnio();

		int res = anio2.compareTo(anio1);

		return res;
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(String clave, Empleado elemento) {
		String anio = elemento.getAutomovil().getAnio();
		int res = anio.compareTo(clave);
		return res;
	}

}
