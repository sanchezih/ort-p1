package ar.edu.ort.p1.examenes._02_ds.fiscalizador_de_empleados.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeEmpleadosPorDNI extends ListaOrdenadaNodos<String, Empleado> {

	/**
	 * 
	 */
	@Override
	public int compare(Empleado empleadoNuevo, Empleado empleado) {

		// En este caso, tambien se podria llamar al compareByKey
		// compareByKey(empleadoNuevo.getDni(), empleado);

		return empleadoNuevo.getDni().compareTo(empleado.getDni());
	}

	/**
	 * 
	 */
	@Override
	public int compareByKey(String dni, Empleado empleado) {
		return dni.compareTo(empleado.getDni());
	}
}
