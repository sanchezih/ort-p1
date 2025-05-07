package ar.edu.ort.p1.unidades.unidad04.practico04.ej03_seleccion_argentina.src;

public class Main {

	public static void main(String[] args) {

		Seleccion seleccion = new Seleccion();

		seleccion.mostrarJugadores();

		/**
		 * Ejercicio B: La explotacion del metodo cambio que recibe dos numeros de
		 * camiseta. Si no son iguales, se realiza el cambio de ubicacion de los
		 * jugadores en el plantel.
		 */
		seleccion.cambio(1, 2);
		seleccion.mostrarJugadores();

		/**
		 * Ejercicio C: La explotacion del metodo cambioPorLesion que recibe el numero
		 * de camiseta de un jugador lesionado y el apellido de su reemplazante.
		 * Reemplaza al lesionado por un nuevo jugador con el apellido recibido, con la
		 * misma posicion y numero que el que sale por lesion.
		 */
		seleccion.cambioPorLesion(1, "Caballero");
		// seleccion.mostrarJugadores();

		/**
		 * Ejercicio D: La explotacion del metodo obtenerReservas que devuelva (no
		 * muestre por consola) a todos los jugadores de reserva de la seleccion.
		 */
		// seleccion.mostrarJugadores(seleccion.obtenerReservas());

		/**
		 * Ejercicio E: La explotacion del metodo cantJugadoresPorPosicion que devuelva
		 * (no muestre por consola) la cantidad de jugadores que hay por cada una de las
		 * posiciones en la cancha.
		 */
		// seleccion.mostrarCantJugadoresPorPosicion(seleccion.cantJugadoresPorPosicion());

	}

}
