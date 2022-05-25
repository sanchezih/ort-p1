package ar.edu.ort.p1.examenes.ds.todolibre_t1.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenesPorMonto extends ListaOrdenadaNodos<Double, Orden> {

	@Override
	public int compare(Orden o1, Orden o2) {
		return (int) (o2.getMonto() - o1.getMonto());
	}

	@Override
	public int compareByKey(Double monto, Orden o) {
		return (int) (o.getMonto() - monto);
	}

}
