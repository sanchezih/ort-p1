package edu.ort.tp4.ej03_seleccion_argentina.src.seleccion;

import edu.ort.tp4.ej01_pyme.src.pyme.Empleado;

public class Seleccion {

	private static int CANT_JUG = 23;
	private static int CANT_TIT = 11;
	private static int CANT_SUP = 7;
	private String nombre;
	private Jugador[] jugadores = new Jugador[CANT_JUG];

	public void cambio(int n1, int n2) {

		if(rangoValido(n1) && rangoValido(n2) && n1 != n2) {
			idx1=idxJugador(n1);
			
		}
	}

	public void cambioPorLesion(int a, String b) {

	}

//	+ obtenerReservas(): Jugador[]
//	+ cantJugadoresPorPosicion(): int[]
private int idxJugador(int nro) {
	
	int i=this.jugadores.length - 1;
}
	
	private boolean rangoValido(int nro) {
		final int MIN = 1;
		return nro >= MIN && nro <= CANT_JUG;

	}
	
//	- intercambiar(int, int): void

}
