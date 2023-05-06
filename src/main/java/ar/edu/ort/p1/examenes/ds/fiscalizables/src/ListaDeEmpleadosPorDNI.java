package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorDNI extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		return compareByKey(e1.getDni(), e2);
	}

	@Override
	public int compareByKey(String dni, Empleado e) {
		return dni.compareTo(e.getDni());
	}

}
