package ar.edu.ort.p1.examenes.ds.fiscalizables.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorDNI extends ListaOrdenadaNodos<String, Empleado> {

	@Override
	public int compare(Empleado empleadoNuevo, Empleado empleado) {
		return compareByKey(empleadoNuevo.getDni(), empleado);
	}

	@Override
	public int compareByKey(String dni, Empleado empleado) {
		return dni.compareTo(empleado.getDni());
	}

}
