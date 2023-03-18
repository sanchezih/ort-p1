package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear.array.posicionamientodirecto.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Historial {

	private final static int CANT_MESES = 12;
	private double[] gastosMensuales = new double[CANT_MESES];

	/**
	 * 
	 * @param pagoDeFactura
	 */
	public void acumularGasto(PagoDeFactura pagoDeFactura) {
		this.gastosMensuales[pagoDeFactura.getMes() - 1] += pagoDeFactura.getImporte(); // Acumulo
	}

	/**
	 * 
	 */
	public void mostrarGastosMensuales() {
		UtilArrays.mostrar(this.gastosMensuales);
	}
}
