package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist.lista_ordenada.listas;

import ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist.lista_ordenada.Empleado;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaEmpleadosPorModeloAutomovil extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado dato1, Empleado dato2) {
		return dato1.getAutomovil().getAnio().compareTo(dato2.getAutomovil().getAnio());
	}

	@Override
	public int compareByKey(String clave, Empleado elemento) {
		return clave.compareTo(elemento.getAutomovil().getAnio());
	}

}
