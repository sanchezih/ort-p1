package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public class Guerrero extends Personaje {

	private static final double NIVEL_MIN_VIDA = 0.25;
	private static final double INCR_ATAQUE = 1.2;

	private double fuerza;

	/*----------------------------------------------------------------------------*/

	public Guerrero(double fuerza) {
		this.fuerza = fuerza;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double atacar() {
		return puntosDeVidaMayorA(MAX_VIDA * NIVEL_MIN_VIDA) ? fuerza : fuerza * INCR_ATAQUE;
	}

}
