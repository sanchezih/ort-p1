package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaOrdenadaDeJugadoresPorRanking extends ListaOrdenadaNodos<Integer, Jugador> {

	@Override
	public int compare(Jugador j1, Jugador j2) {
		//return j1.getRanking() - j2.getRanking(); // en ns esta distinto
		return compareByKey(j1.getRanking(),  j2);
	}

	@Override
	public int compareByKey(Integer clave, Jugador jugador) {
		return clave - jugador.getRanking(); // en ns esta distinto
	}

}
