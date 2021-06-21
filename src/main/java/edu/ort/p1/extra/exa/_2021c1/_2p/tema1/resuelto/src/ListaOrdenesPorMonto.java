package edu.ort.p1.extra.exa._2021c1._2p.tema1.resuelto.src;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenesPorMonto extends ListaOrdenadaNodos<Double, Orden> {

	@Override
	public int compare(Orden o1, Orden o2) {
		return (int) (o1.getMonto() - o2.getMonto());
	}

	@Override
	public int compareByKey(Double monto, Orden o) {
		return (int) (monto - o.getMonto());
	}

}
