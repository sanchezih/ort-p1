package ar.edu.ort.p1.unidades.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class OrtLand {
	ArrayList<Juego> juegos;

	/**
	 * Ejercicio B: La explotacion del metodo obtenerDisponibilidadJuegos que
	 * devuelve una lista de elementos que contengan el nombre del juego y la
	 * cantidad de lugares disponibles de cada uno.
	 * 
	 * @return
	 */
	public ArrayList<InformeJuegos> obtenerDisponibilidadJuegos() {

		ArrayList<InformeJuegos> lista = new ArrayList<InformeJuegos>();

		for (Juego j : this.juegos) {
			InformeJuegos inf = new InformeJuegos(j.getNombre(), j.dameLugaresDisp());
			lista.add(inf);
		}
		return lista;
	}

	/**
	 * La explotacion del metodo acomodarJugador de la clase OrtLand que reciba el
	 * nombre de un jugador, su edad y el nombre del juego en el que quiere
	 * participar. Debe intentar sumarlo a la mesa que tenga la mayor cantidad de
	 * jugadores en donde aun tenga lugar disponible. Si se encuentra lugar, la mesa
	 * debera agregarlo a su lista de jugadores. Devolvera uno estos posibles
	 * resultados: SIN_DISPONIBILIDAD: cuando no se haya podido agregar al jugador a
	 * una mesa existente. JUEGO_NO_ENCONTRADO: cuando no se encuentre el juego con
	 * el nombre provisto. ASIGNACION_OK: cuando el jugador haya sido asignado.
	 * 
	 * @param nombreJugador
	 * @param edad
	 * @param nombreJuego
	 * @return
	 */
	public Resultado acomodarJugador(String nombreJugador, int edad, String nombreJuego) {
		Resultado res = Resultado.JUEGO_NO_ENCONTRADO;
		Juego ju;

		ju = buscarJuego(nombreJuego);
		if (ju != null) {
			res = ju.acomodarJugador(nombreJugador, edad);
		}
		return res;
	}

	private Juego buscarJuego(String nombreJuego) {
		// TODO Auto-generated method stub
		return null;
	}

}
