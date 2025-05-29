package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public class Main {

	public static void main(String[] args) {

		// Creo personajes
		Guerrero guerrero = new Guerrero(50.5);
		Arquero arquero = new Arquero(75, 22.5);

		// Creo jugadores
		Jugador j1 = new Jugador("1", 3, 10);
		j1.agregarPartida(new Partida(arquero, Resultado.TRIUNFO));

		Jugador j2 = new Jugador("2", 3, 24);
		j2.agregarPartida(new Partida(guerrero, Resultado.DERROTA));

		Juego juego = new Juego();

		// Agrego jugadores
		juego.addJugador(j1);
		juego.addJugador(j2);

		// Test Ejercicio 1
		int[] res = juego.getResumenPartidas("1");

		// Test Ejercicio 2
		Jugador[][] res2 = juego.getTopJugadoresPorRegion(2);

		// Test Ejercicio 3
		//juego.realizarPartida(3);

		System.out.println("Fin");

	}

}
