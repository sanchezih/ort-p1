package ar.edu.ort.p1.examenes.oop.estadisticas_carritos_compras.src;

import ar.edu.ort.p1.util.Fecha;

public class TransferenciaBancaria extends MetodoDePago {

	private final static double REC = 0.05;
	private final static double REC_DEMORA = 0.05;
	private final static int DIAS_DEMORA = 10;

	private String cbu;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param cbu
	 */
	public TransferenciaBancaria(Fecha fechaDePago, String cbu) {
		super(fechaDePago);
		this.cbu = cbu;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getDctoORecargo() {
		double recargo= REC;
		
		if (super.getDiasDeDemoraDePago() > DIAS_DEMORA) {
			recargo = recargo + REC_DEMORA;
		}
		return recargo;
	}

}
