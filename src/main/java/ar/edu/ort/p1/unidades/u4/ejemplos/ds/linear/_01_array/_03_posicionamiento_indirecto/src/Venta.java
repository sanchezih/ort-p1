package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear._01_array._03_posicionamiento_indirecto.src;

public class Venta {

	private String fecha;
	private double importe;
	private String legajoVendedor;

	public Venta(String fecha, double importe, String legajoVendedor) {
		this.fecha = fecha;
		this.importe = importe;
		this.legajoVendedor = legajoVendedor;
	}

	public double getImporte() {
		return importe;
	}

	public String getLegajoVendedor() {
		return legajoVendedor;
	}

}
