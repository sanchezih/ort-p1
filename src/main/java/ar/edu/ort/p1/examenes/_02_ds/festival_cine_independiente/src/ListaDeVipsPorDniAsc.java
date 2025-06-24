package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeVipsPorDniAsc extends ListaOrdenadaNodos<Integer, Integer> {

	@Override
	public int compare(Integer dni1, Integer dni2) {
		return dni1.compareTo(dni2);
	}

	@Override
	public int compareByKey(Integer dni1, Integer dni2) {
		return dni1.compareTo(dni2);
	}

}
