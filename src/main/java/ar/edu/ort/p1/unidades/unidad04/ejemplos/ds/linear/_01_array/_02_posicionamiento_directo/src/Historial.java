package ar.edu.ort.p1.unidades.unidad04.ejemplos.ds.linear._01_array._02_posicionamiento_directo.src;

import com.github.sanchezih.util.ds.UtilArrays;

public class Historial {

	private static final int CANT_MESES = 12;
	private double[] gastosMensuales = new double[CANT_MESES];

	/*----------------------------------------------------------------------------*/

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
