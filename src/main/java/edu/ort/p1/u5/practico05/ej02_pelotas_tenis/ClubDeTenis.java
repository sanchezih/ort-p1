package edu.ort.p1.u5.practico05.ej02_pelotas_tenis;

public class ClubDeTenis {

	public static boolean esTuboUsado(TuboPelotasDeTenis tubo) {
		return !tubo.isFull() || tubo.hayAlgunaPelotaUsada();

	}

}
