package ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src;

import ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src.seleccion.Jugador;
import ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src.seleccion.Posicion;
import ar.edu.ort.p1.u4.practico04.ej03_seleccion_argentina.src.seleccion.Seleccion;

public class Main {

	public static void main(String[] args) {

		// Titulares
		Jugador j01 = new Jugador("Guzman", 1, Posicion.ARQUERO);
		Jugador j02 = new Jugador("Mercado", 2, Posicion.DEFENSOR);
		Jugador j03 = new Jugador("Tagliafico", 3, Posicion.DEFENSOR);
		Jugador j04 = new Jugador("Ansaldi", 4, Posicion.DEFENSOR);
		Jugador j05 = new Jugador("Biglia", 5, Posicion.MEDIOCAMPISTA);
		Jugador j06 = new Jugador("Fazio", 6, Posicion.DEFENSOR);
		Jugador j07 = new Jugador("Banega", 7, Posicion.MEDIOCAMPISTA);
		Jugador j08 = new Jugador("Acuna", 8, Posicion.DEFENSOR);
		Jugador j09 = new Jugador("Higuain", 9, Posicion.DELANTERO);
		Jugador j10 = new Jugador("Messi", 10, Posicion.DELANTERO);
		Jugador j11 = new Jugador("Di Maria", 11, Posicion.MEDIOCAMPISTA);

		// Suplentes
		Jugador j12 = new Jugador("Armani", 12, Posicion.ARQUERO);
		Jugador j13 = new Jugador("Meza", 13, Posicion.MEDIOCAMPISTA);
		Jugador j14 = new Jugador("Mascherano", 14, Posicion.MEDIOCAMPISTA);
		Jugador j15 = new Jugador("Perez", 15, Posicion.MEDIOCAMPISTA);
		Jugador j16 = new Jugador("Rojo", 16, Posicion.DEFENSOR);
		Jugador j17 = new Jugador("Otamendi", 17, Posicion.DEFENSOR);
		Jugador j18 = new Jugador("Salvio", 18, Posicion.DEFENSOR);

		// Reserva
		Jugador j19 = new Jugador("Aguero", 19, Posicion.DELANTERO);
		Jugador j20 = new Jugador("Lo Celso", 20, Posicion.MEDIOCAMPISTA);
		Jugador j21 = new Jugador("Dybala", 21, Posicion.DELANTERO);
		Jugador j22 = new Jugador("Pavon", 22, Posicion.MEDIOCAMPISTA);
		Jugador j23 = new Jugador("Caballero", 23, Posicion.ARQUERO);

		Jugador[] jugadores = { j01, j02, j03, j04, j05, j06, j07, j08, j09, j10, j11, j12, j13, j14, j15, j16, j17,
				j18, j19, j20, j21, j22, j23 };

		Seleccion seleccion = new Seleccion("Seleccion Argentina de Futbol", jugadores);

		// seleccion.mostrarJugadores();

		// Ejercicio B
		// seleccion.cambio(1, 2);
		// seleccion.mostrarJugadores();

		// Ejercicio C
		// seleccion.cambioPorLesion(1, "Caballero");
		// seleccion.mostrarJugadores();

		// Ejercicio D
		seleccion.mostrarJugadores(seleccion.obtenerReservas());

		// Ejercicio E
		seleccion.mostrarCantJugadoresPorPosicion(seleccion.cantJugadoresPorPosicion());

	}

}
