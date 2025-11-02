package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public abstract class Personaje {

	public static final double MAX_VIDA = 100;

	private double puntosVida;

	public abstract double atacar();

	protected boolean puntosDeVidaMayorA(double valor) {
		return puntosVida > valor;
	};

	public boolean defenderse(double ataque) {
		double ataqueResultante;
		ataqueResultante = ataque * Math.random();
		puntosVida = puntosDeVidaMayorA(ataqueResultante) ? puntosVida - ataqueResultante : 0;
		return puntosVida == 0;
	}

}
