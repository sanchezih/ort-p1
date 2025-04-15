package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public class Critico extends Espectador {

	private int tiempoDisponible;

	/*----------------------------------------------------------------------------*/

	public Critico(String dni, String espectaculo, boolean acompanante, int tiempoDisponible) {
		super(dni, espectaculo, acompanante);
		this.tiempoDisponible = tiempoDisponible;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean tieneTiempoDisponible(int duracionObra) {
		return this.tiempoDisponible >= duracionObra;
	}
}
