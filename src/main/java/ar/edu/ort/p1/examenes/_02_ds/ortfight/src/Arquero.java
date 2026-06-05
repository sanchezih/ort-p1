package ar.edu.ort.p1.examenes._02_ds.ortfight.src;

public class Arquero extends Personaje {
	private int cantidadFlechas;
	private double potenciaArco;

	/*----------------------------------------------------------------------------*/

	public Arquero(int cantidadFlechas, double potenciaArco) {
		this.cantidadFlechas = cantidadFlechas;
		this.potenciaArco = potenciaArco;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double atacar() {
		double ataque = 0;

		if (cantidadFlechas > 0) {
			ataque = potenciaArco;
			cantidadFlechas--;
		}
		return ataque;
	}

}
