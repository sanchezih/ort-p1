package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public class Partida {
	private Personaje personaje;
	private Resultado resultado;

	/*----------------------------------------------------------------------------*/

	public Partida(Personaje personaje, Resultado resultado) {
		this.personaje = personaje;
		this.resultado = resultado;
	}

	/*----------------------------------------------------------------------------*/

	public Resultado getResultado() {
		return resultado;
	}

	/*----------------------------------------------------------------------------*/

	public static void ejecutar(Jugador j1, Jugador j2) {
		// TODO Auto-generated method stub

	}

}
