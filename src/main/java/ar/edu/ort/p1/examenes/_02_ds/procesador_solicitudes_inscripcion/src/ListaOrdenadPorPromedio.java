package ar.edu.ort.p1.examenes._02_ds.procesador_solicitudes_inscripcion.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaOrdenadPorPromedio extends ListaOrdenadaNodos<Float, Solicitud> {

	@Override
	public int compare(Solicitud sol1, Solicitud sol2) {
		return (int) (sol2.getAlumno().getPromedio() - sol1.getAlumno().getPromedio());
	}

	@Override
	public int compareByKey(Float promedio, Solicitud solicitud) {
		return (int) (solicitud.getAlumno().getPromedio() - promedio);
	}

}
