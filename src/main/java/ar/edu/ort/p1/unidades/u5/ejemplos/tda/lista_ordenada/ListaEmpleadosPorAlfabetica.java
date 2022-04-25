package ar.edu.ort.p1.unidades.u5.ejemplos.tda.lista_ordenada;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaEmpleadosPorAlfabetica extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado dato1, Empleado dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	public int compareByKey(String clave, Empleado elemento) {
		return clave.compareTo(elemento.getNombre());
	}

}
