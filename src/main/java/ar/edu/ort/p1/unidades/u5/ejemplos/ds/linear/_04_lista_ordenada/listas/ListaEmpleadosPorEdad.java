package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._04_lista_ordenada.listas;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._04_lista_ordenada.entidades.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaEmpleadosPorEdad extends ListaOrdenadaNodos<Integer, Empleado> {

	/**
	 * 
	 */
	@Override
	public int compare(Empleado empleado1, Empleado emeplado2) {
		return empleado1.getEdad() - emeplado2.getEdad();
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(Integer clave, Empleado empleado) {
		return clave - empleado.getEdad();
	}

}
