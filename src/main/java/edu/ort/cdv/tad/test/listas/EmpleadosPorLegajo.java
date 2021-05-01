package edu.ort.cdv.tad.test.listas;

import edu.ort.cdv.u6.tad.ListaOrdenada;

public class EmpleadosPorLegajo extends ListaOrdenada<Integer, Empleado> {

	@Override
	protected int compare(Empleado empleado1, Empleado empleado2) {
		return empleado1.getLegajo() - empleado2.getLegajo();
	}

	@Override
	protected int compareByKey(Integer clave, Empleado empleado) {
		return clave - empleado.getLegajo();
	}

}
