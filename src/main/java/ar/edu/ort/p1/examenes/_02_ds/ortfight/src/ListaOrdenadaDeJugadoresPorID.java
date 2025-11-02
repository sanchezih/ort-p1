package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaOrdenadaDeJugadoresPorID extends ListaOrdenadaNodos<String, Jugador> {

	@Override
	public int compare(Jugador j1, Jugador j2) {
		return j1.getId().compareTo(j2.getId());
	}

	@Override
	public int compareByKey(String clave, Jugador jugador) {
		return clave.compareTo(jugador.getId());
	}

}
