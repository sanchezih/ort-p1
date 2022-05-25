package ar.edu.ort.p1.examenes.ds.ortcapital.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenadaDeSolicitudesPorPrecioOfertado extends ListaOrdenadaNodos<Double, Solicitud> {

	@Override
	public int compare(Solicitud sol1, Solicitud sol2) {
		return (int) (sol1.getPrecioOfertado() - sol2.getPrecioOfertado());
	}

	@Override
	public int compareByKey(Double precioOfertado, Solicitud sol2) {
		return (int) (precioOfertado - sol2.getPrecioOfertado());
	}

}
