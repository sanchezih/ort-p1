package ar.edu.ort.p1.examenes.ds.todolibre_t1.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenesPorMonto extends ListaOrdenadaNodos<Double, Orden> {

	/**
	 * Hago una resta porque sino no tengo forma de en algun caso se devuelva un
	 * negativo (-)
	 */
	@Override
	public int compare(Orden ordenNueva, Orden ordenContraLaQueComparo) {
		return (int) (ordenContraLaQueComparo.getMonto() - ordenNueva.getMonto());
	}

	@Override
	public int compareByKey(Double monto, Orden orden) {
		int res = (int) (monto - orden.getMonto());
		return res;
	}

}
