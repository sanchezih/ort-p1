package edu.ort.u5.tad.test;

import edu.ort.u5.tad.ListaOrdenada;
import edu.ort.u5.tad.test.entidades.Empleado;

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
