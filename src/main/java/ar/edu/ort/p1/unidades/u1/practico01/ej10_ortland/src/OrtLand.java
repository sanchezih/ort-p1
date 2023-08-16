package ar.edu.ort.p1.unidades.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class OrtLand {

	private ArrayList<Juego> juegos;

	/*----------------------------------------------------------------------------*/

	public OrtLand() {
		this.juegos = new ArrayList<Juego>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo obtenerDisponibilidadJuegos que
	 * devuelve una lista de elementos que contengan el nombre del juego y la
	 * cantidad de lugares disponibles de cada uno.
	 * 
	 * @return
	 */
	public ArrayList<InformeJuegos> obtenerDisponibilidadJuegos() {

		ArrayList<InformeJuegos> lista = new ArrayList<InformeJuegos>();

		for (Juego juego : this.juegos) {
			InformeJuegos informeJuegos = new InformeJuegos(juego.getNombre(), juego.dameLugaresDisp());
			lista.add(informeJuegos);
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: La explotacion del metodo acomodarJugador de la clase OrtLand
	 * que reciba el nombre de un jugador, su edad y el nombre del juego en el que
	 * quiere participar. Debe intentar sumarlo a la mesa que tenga la mayor
	 * cantidad de jugadores en donde aun tenga lugar disponible. Si se encuentra
	 * lugar, la mesa debera agregarlo a su lista de jugadores.
	 * 
	 * Devolvera uno estos posibles resultados:
	 * 
	 * SIN_DISPONIBILIDAD: cuando no se haya podido agregar al jugador a una mesa
	 * existente.
	 * 
	 * JUEGO_NO_ENCONTRADO: cuando no se encuentre el juego con el nombre provisto.
	 * 
	 * ASIGNACION_OK: cuando el jugador haya sido asignado.
	 * 
	 * @param nombreJugador
	 * @param edad
	 * @param nombreJuego
	 * @return
	 */
	public Resultado acomodarJugador(String nombreJugador, int edad, String nombreJuego) {
		Resultado resultado = Resultado.JUEGO_NO_ENCONTRADO;
		Juego ju;

		ju = buscarJuego(nombreJuego);
		if (ju != null) {
			resultado = ju.acomodarJugador(nombreJugador, edad);
		}
		return resultado;
	}

	/**
	 * 
	 * @param nombreJuego
	 * @return
	 */
	private Juego buscarJuego(String nombreJuego) {
		// TODO Auto-generated method stub
		return null;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarJuego(Juego juego) {
		this.juegos.add(juego);
	}

}
