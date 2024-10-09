package ar.edu.ort.p1.unidades.unidad05.practico05.ej02_pelotas_tenis.src;

public class ClubDeTenis {

	/**
	 * Ejercicio B: La explotacion del metodo esTuboUsado que reciba un tubo de
	 * pelotas por parametro y devuelva si tal tubo es usado o no.
	 * 
	 * Un tubo de pelotas se considerara usado cuando no este lleno o al menos una
	 * de sus pelotas no sea nueva.
	 */
	public static boolean esTuboUsado(TuboDePelotasDeTenis tubo) {

		return !tubo.isFull() || tubo.hayAlgunaPelotaUsada();
	}
}
