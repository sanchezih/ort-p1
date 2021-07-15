package edu.ort.p1.extra.examenes._2021c1._recu1.reclamos_infracciones.src;

public class ExcesoVelocidad extends Infraccion {

	private final static int CANT_UNIDADES = 10;

	public ExcesoVelocidad(double valorUnidad, Fecha fecha) {
		super(valorUnidad, fecha);
	}

	/**
	 * C) El metodo caducada() de las clases que considere necesario, que debe
	 * indicar si la infracción esta caducada o no.
	 */
	@Override
	public boolean caducada() {
		return false;
	}

	@Override
	public double valorInfraccion() {
		double res = ExcesoVelocidad.CANT_UNIDADES * getValorUnidad();
		return res;
	}

	@Override
	public String toString() {
		return "Tipo ExcesoVelocidad\t" + super.toString();
	}

}
