package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorNombreDesc extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 
	 */
	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {

		String nombreEmp1 = empleado1.getNombre();
		String nombreEmp2 = empleado2.getNombre();

		return nombreEmp2.compareTo(nombreEmp1);
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(String nombre, Empleado empleado) {
		String nombreEmpleado = empleado.getNombre();
		int res = nombreEmpleado.compareTo(nombre);
		return res;
	}

}
