package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import com.github.sanchezih.util.Fecha;

public class TransferenciaBancaria extends MetodoDePago {

	private static final double REC = 0.05;
	private static final double REC_DEMORA = 0.05;
	private static final int DIAS_DEMORA = 10;

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
		double recargo = REC;

		if (super.getDiasDeDemoraDePago() > DIAS_DEMORA) {
			recargo = recargo + REC_DEMORA;
		}
		return recargo;
	}

}
