package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaEmpsPorDNI extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		return compareByKey(e1.getDNI(), e2);
	}

	@Override
	public int compareByKey(String DNI, Empleado e) {
		return DNI.compareTo(e.getDNI());
	}

}
