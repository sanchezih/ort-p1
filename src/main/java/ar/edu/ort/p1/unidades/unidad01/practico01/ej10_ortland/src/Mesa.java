package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

	private static final int CANT_CARTAS_X_PARTICIPANTE = 4;

	private int numero;
	private int cantParticipantesMax;
	private List<Participante> participantes;
	private Mazo mazo;

	/*----------------------------------------------------------------------------*/

	public Mesa(int numero, int cantParticipantesMax) {
		this.numero = numero;
		this.cantParticipantesMax = cantParticipantesMax;
		this.participantes = new ArrayList<Participante>();
		this.mazo = new Mazo();
	}

	/*----------------------------------------------------------------------------*/

	public int getNumero() {
		return numero;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getLugaresDisponibles() {
		return this.cantParticipantesMax - this.participantes.size();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo repartirCartas que reparta una carta a
	 * cada jugador siguiendo una ronda hasta llegar a darle 4 a cada uno.
	 * 
	 * Debe haber por lo menos dos jugadores en la mesa.
	 * 
	 * Verificar no quedarse sin cartas para repartir. Devuelve true o false
	 * dependiendo de si pudo repartir las cartas o no.
	 * 
	 * @return
	 */
	public boolean repartirCartas() {

		System.out.println("Se repartiran cartas en la mesa " + this.numero);

		boolean sePuedeRepartir = hayParticipantesSuficientes() && hayCartasSuficientes();

		if (sePuedeRepartir) {
			efectuarReparticion();
		}
		return sePuedeRepartir;
	}

	/**
	 * 
	 * @return
	 */
	private boolean hayParticipantesSuficientes() {
		final int CANT_PARTICIPANTES_MIN = 2;
		return this.participantes.size() >= CANT_PARTICIPANTES_MIN;
	}

	/**
	 * 
	 * @return
	 */
	private boolean hayCartasSuficientes() {
		return this.participantes.size() * Mesa.CANT_CARTAS_X_PARTICIPANTE <= this.mazo.getCantidadDeCartas();
	}

	/**
	 * 
	 */
	private void efectuarReparticion() {
		for (int i = 0; i < Mesa.CANT_CARTAS_X_PARTICIPANTE; i++) {
			for (Participante participante : this.participantes) {
				System.out.println("\t-> Se entrega la " + (i + 1) + "° carta para " + participante.getNombre());
				participante.darCarta(this.mazo.getProximaCarta());
			}
		}
	}

	/*----------------------------------------------------------------------------*/

	public int getCantidadDeParticipantes() {
		return this.participantes.size();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarParticipante(Participante participante) {
		this.participantes.add(participante);
		System.out.println("Participante agregado en mesa " + this.getNumero());
	}
}
