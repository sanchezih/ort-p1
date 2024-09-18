package ar.edu.ort.p1.unidades.unidad04.ejemplos.ds.linear._01_array._02_posicionamiento_directo.src;

public class PagoDeFactura {

	private double importe;
	private String empresa;
	private int mes;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param importe
	 * @param empresa
	 * @param mes
	 */
	public PagoDeFactura(double importe, String empresa, int mes) {
		this.importe = importe;
		this.empresa = empresa;
		this.mes = mes;
	}

	/*----------------------------------------------------------------------------*/

	public double getImporte() {
		return importe;
	}

	public int getMes() {
		return mes;
	}

}
