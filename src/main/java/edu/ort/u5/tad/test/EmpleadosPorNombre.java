package edu.ort.u5.tad.test;

import edu.ort.u5.tad.ListaOrdenada;
import edu.ort.u5.tad.test.entidades.Empleado;

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
