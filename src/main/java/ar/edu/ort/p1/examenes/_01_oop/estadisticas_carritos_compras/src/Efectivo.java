package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

import com.github.sanchezih.util.Fecha;

public class Efectivo extends MetodoDePago {

	private static final double DCTO = 0.1;
	private static final double DCTO_CONS_FINAL = 0.15;

	private boolean consumidorFinal;

	/*----------------------------------------------------------------------------*/

	public Efectivo(Fecha fechaDePago, boolean consumidorFinal) {
		super(fechaDePago);
		this.consumidorFinal = consumidorFinal;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getDctoORecargo() {
		double dcto = DCTO;

		if (this.consumidorFinal) {
			dcto = DCTO_CONS_FINAL;
		}
		return -dcto; // Notar el cambio de signo
	}
}
