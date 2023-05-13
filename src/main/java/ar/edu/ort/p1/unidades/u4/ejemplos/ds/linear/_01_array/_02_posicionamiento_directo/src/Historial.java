package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear._01_array._02_posicionamiento_directo.src;

import ar.edu.ort.p1.util.UtilArrays;

public class Historial {

	private final static int CANT_MESES = 12;
	private double[] gastosMensuales = new double[CANT_MESES];

	/**
	 * 
	 * @param pagoDeFactura
	 */
	public void acumularGasto(PagoDeFactura pagoDeFactura) {
		this.gastosMensuales[pagoDeFactura.getMes() - 1] += pagoDeFactura.getImporte(); // Acumulador
	}

	/**
	 * 
	 */
	public void mostrarGastosMensuales() {
		UtilArrays.mostrar(this.gastosMensuales);
	}
}
