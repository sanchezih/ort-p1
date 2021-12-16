package ar.edu.ort.p1.unidades.u5.practico05.ej02_pelotas_tenis.src;

public class ClubDeTenis {

	/*
	 * Un tubo de pelotas se considerara usado cuando no este lleno o al menos una
	 * de sus pelotas no sea nueva.
	 */

	public static boolean esTuboUsado(TuboPelotasDeTenis tubo) {

		return !tubo.isFull() || tubo.hayAlgunaPelotaUsada();
	}
}
