package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

import ar.edu.ort.p1.util.Fecha;

public class ExcesoVelocidad extends Infraccion {

	private final static int CANT_UNIDADES = 10;

	public ExcesoVelocidad(double valorUnidad, Fecha fecha) {
		super(valorUnidad, fecha);
	}

	/**
	 * Ejercicio C: El metodo caducada() de las clases que considere necesario, que
	 * debe indicar si la infraccion esta caducada o no.
	 */
	@Override
	public boolean caducada() {
		return false;
	}

	@Override
	public double valorInfraccion() {
		return ExcesoVelocidad.CANT_UNIDADES * getValorUnidad();
	}

	@Override
	public String toString() {
		return "Tipo ExcesoVelocidad\t" + super.toString();
	}

}
