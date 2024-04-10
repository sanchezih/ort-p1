package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import ar.edu.ort.p1.util.Fecha;

public class TarjetaDeCredito extends MetodoDePago {

	private final static double REC_X_CUOTA = 0.15;

	private int nroDeCuotas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param nroDeCuotas
	 */
	public TarjetaDeCredito(Fecha fechaDePago, int nroDeCuotas) {
		super(fechaDePago);
		this.nroDeCuotas = nroDeCuotas;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getDctoORecargo() {
		return REC_X_CUOTA * this.nroDeCuotas;
	}

	/**
	 * 
	 * @return
	 */
	public int getNroDeCuotas() {
		return this.nroDeCuotas;
	}

}
