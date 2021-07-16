package edu.ort.p1.u4.ejemplos.array.posicionamientodirecto;

public class PagoDeFactura {
	private double importe;
	private String empresa;
	private int mes;

	public PagoDeFactura(double importe, String empresa, int mes) {
		super();
		this.importe = importe;
		this.empresa = empresa;
		this.mes = mes;
	}

	public double getImporte() {
		return importe;
	}

	public int getMes() {
		return mes;
	}
}
