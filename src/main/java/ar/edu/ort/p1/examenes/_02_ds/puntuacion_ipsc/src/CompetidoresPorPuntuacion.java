package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class CompetidoresPorPuntuacion extends ListaOrdenadaNodos<Integer, Competidor> {

	@Override
	public int compare(Competidor elemento1, Competidor elemento2) {
		return elemento2.getPuntosObtenidos() - elemento1.getPuntosObtenidos();
	}

	@Override
	public int compareByKey(Integer key, Competidor elemento) {
		return key.intValue() - elemento.getPuntosObtenidos();
	}

}
