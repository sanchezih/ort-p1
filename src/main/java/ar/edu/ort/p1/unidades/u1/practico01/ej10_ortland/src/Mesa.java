package ar.edu.ort.p1.unidades.u1.practico01.ej10_ortland.src;

import java.util.ArrayList;

public class Mesa {

	private final static int CANT_CARTAS_CADA_UNO = 4;
	private int numero;
	private int cantParticipantesMax;
	private ArrayList<Participante> participantes;
	private Mazo mazo;

	public int dameLugaresDisp() {
		return this.cantParticipantesMax - this.participantes.size();
	}

	/**
	 * Ejercicio C: La explotacion del metodo repartirCartas que reparta una carta a
	 * cada jugador siguiendo una ronda hasta llegar a darle 4 a cada uno. Debe
	 * haber por lo menos dos jugadores en la mesa. Verificar no quedarse sin cartas
	 * para repartir. Devuelve true o false dependiendo de si pudo repartir las
	 * cartas o no.
	 * 
	 * @return
	 */
	public boolean repartirCartas() {
		boolean sePuedeRepartir;
		sePuedeRepartir = hayParticipantesSuficientes() && hayCartasSuficientes();
		if (sePuedeRepartir) {
			efectuarReparticion();
		}
		return sePuedeRepartir;
	}

	private void efectuarReparticion() {
		for (int i = 0; i < Mesa.CANT_CARTAS_CADA_UNO; i++) { // revisar for
			for (Participante participante : this.participantes) {
				System.out.println("Repartiendo carta " + i + " para " + participante.getNombre());
				participante.darCarta(this.mazo.proximaCarta());
			}
		}
	}

	private boolean hayParticipantesSuficientes() {
		final int PARTICIPANTES_MIN = 2;
		return this.participantes.size() >= PARTICIPANTES_MIN;
	}

	private boolean hayCartasSuficientes() {
		return this.participantes.size() * Mesa.CANT_CARTAS_CADA_UNO <= this.mazo.cantCartas();
	}

	public int cantParticipantes() {
		return this.participantes.size();
	}

	public void agregarParticipante(Participante participante) {
		this.participantes.add(participante);
	}
}
