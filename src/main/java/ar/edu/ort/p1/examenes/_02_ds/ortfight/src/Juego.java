package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

import java.util.Iterator;

public class Juego {

	private static final int CANT_REG = 4;

	private ColaDeJugadores[] colasJugadores;
	private ListaOrdenadaDeJugadoresPorID jugadores;

	/**
	 * 
	 */
	public Juego() {
		this.colasJugadores = new ColaDeJugadores[CANT_REG];
		this.jugadores = new ListaOrdenadaDeJugadoresPorID();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 1
	 * 
	 * @param id
	 * @return
	 */
	public int[] getResumenPartidas(String id) {
		return jugadores.search(id).obtenerResumenPartidas();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 2
	 * 
	 * @param top
	 * @return
	 */
	public Jugador[][] getTopJugadoresPorRegion(int top) {
		Jugador[][] jugadoresTop = new Jugador[CANT_REG][top];
		ListaOrdenadaDeJugadoresPorRanking listaRanking = ordenarPorRanking();

		for (int reg = 0; reg < CANT_REG; reg++) {
			jugadoresTop[reg] = getTopJugadores(listaRanking, top, reg);
		}
		return jugadoresTop;
	}

	/**
	 * 
	 * @return
	 */
	private ListaOrdenadaDeJugadoresPorRanking ordenarPorRanking() {
		ListaOrdenadaDeJugadoresPorRanking listaRanking;

		listaRanking = new ListaOrdenadaDeJugadoresPorRanking();

		for (Jugador jugador : this.jugadores) {
			listaRanking.add(jugador);
		}
		return listaRanking;
	}

	/**
	 * 
	 * @param listaRanking
	 * @param top
	 * @param reg
	 * @return
	 */
	private Jugador[] getTopJugadores(ListaOrdenadaDeJugadoresPorRanking listaRanking, int top, int region) {

		Iterator<Jugador> iterator;
		Jugador[] jugadoresTop;
		int cant = 0;
		Jugador jugador;

		jugadoresTop = new Jugador[top];
		iterator = listaRanking.iterator();

		while (cant < top && iterator.hasNext()) {
			jugador = iterator.next();
			if (jugador.getRegion() == region) {
				jugadoresTop[cant] = jugador;
				cant++;
			}
		}
		return jugadoresTop;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio 3
	 * 
	 * @param region
	 */
	public void realizarPartida(int region) {
		Jugador j1;
		Jugador j2;

		j1 = colasJugadores[region].remove();
		j2 = colasJugadores[region].remove();
		// Partida.ejecutar(j1, j2);
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void addJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}

}
