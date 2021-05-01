package edu.ort.cdv.tad.test.listas;

import edu.ort.cdv.u6.tad.ListaOrdenada;

public class EmpleadosPorNombre extends ListaOrdenada<String, Empleado> {

	@Override
	protected int compare(Empleado dato1, Empleado dato2) {
		return dato1.getNombre().compareTo(dato2.getNombre());
	}

	@Override
	protected int compareByKey(String clave, Empleado empleado) {
		return clave.compareTo(empleado.getNombre());
	}

}
