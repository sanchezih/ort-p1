package edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src.listasordenadas;

import edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src.Orden;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaOrdenesPorMonto extends ListaOrdenadaNodos<Double, Orden> {

	@Override
	public int compare(Orden o1, Orden o2) {
		return (int) o2.precioTotal() - (int) o1.precioTotal();
	}

	@Override
	public int compareByKey(Double monto, Orden o) {
		return (int) (o.precioTotal() - monto);
	}

}
