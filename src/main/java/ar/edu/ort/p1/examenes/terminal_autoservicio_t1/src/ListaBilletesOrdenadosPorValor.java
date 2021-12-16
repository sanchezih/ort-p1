package ar.edu.ort.p1.examenes.terminal_autoservicio_t1.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaBilletesOrdenadosPorValor extends ListaOrdenadaNodos<Integer, Billete> {

	@Override
	public int compare(Billete b1, Billete b2) {
		return b1.getValor().getNumero() - b2.getValor().getNumero();
	}

	@Override
	public int compareByKey(Integer valor, Billete b2) {
		return valor - b2.getValor().getNumero();

	}

}
