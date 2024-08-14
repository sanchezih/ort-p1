package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

public class Main {

	public static void main(String[] args) {

		// Creo mesas

		Mesa mesa1 = new Mesa(1, 3);
		mesa1.agregarParticipante(new Participante("Juliana", 38));
		mesa1.agregarParticipante(new Participante("Ulises", 35));

		Mesa mesa2 = new Mesa(2, 4);
		mesa2.agregarParticipante(new Participante("Juan", 19));
		mesa2.agregarParticipante(new Participante("Florencia", 25));
		mesa2.agregarParticipante(new Participante("Ana", 41));

		Mesa mesa3 = new Mesa(3, 2);
		Mesa mesa4 = new Mesa(4, 2);
		Mesa mesa5 = new Mesa(5, 2);

		// Creo juegos
		Juego truco = new Juego("Truco");
		truco.agregarMesa(mesa1);
		truco.agregarMesa(mesa2);

		Juego escoba = new Juego("Escoba");
		escoba.agregarMesa(mesa3);
		escoba.agregarMesa(mesa4);
		escoba.agregarMesa(mesa5);

		// Creo ORTLand
		OrtLand ortland = new OrtLand();
		ortland.agregarJuego(truco);
		ortland.agregarJuego(escoba);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		for (InformeJuegos informe : ortland.obtenerDisponibilidadJuegos()) {
			System.out.println(informe);
		}

		// Test ejercicio C

		System.out.println();
		System.out.println("--- SE REPARTEN CARTAS ---");
		System.out.println();

		mesa1.repartirCartas();
		mesa2.repartirCartas();

		// Test ejercicio D

		System.out.println();
		System.out.println("--- SE ACOMODAN NUEVOS JUGADORES ---");
		System.out.println();

		System.out.println(ortland.acomodarJugador("Carlos", 39, "Truco"));

	}

}
