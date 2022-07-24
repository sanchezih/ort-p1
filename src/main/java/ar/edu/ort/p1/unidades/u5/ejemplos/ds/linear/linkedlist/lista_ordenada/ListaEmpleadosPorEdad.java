package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist.lista_ordenada;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaEmpleadosPorEdad extends ListaOrdenadaNodos<Integer, Empleado> {

	@Override
	public int compare(Empleado dato1, Empleado dato2) {
		return dato1.getEdad() - dato2.getEdad();
	}

	@Override
	public int compareByKey(Integer clave, Empleado elemento) {
		return clave - elemento.getEdad();
	}

}
