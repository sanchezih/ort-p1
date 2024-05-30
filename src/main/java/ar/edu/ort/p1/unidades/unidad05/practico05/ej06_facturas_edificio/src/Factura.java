package ar.edu.ort.p1.unidades.unidad05.practico05.ej06_facturas_edificio.src;

public class Factura {

	private String codigoBarras;
	private int nroMes;
	private double monto;
	private TipoFactura tipo;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param codigoBarras
	 * @param nroMes
	 * @param monto
	 * @param tipo
	 */
	public Factura(String codigoBarras, int nroMes, double monto, TipoFactura tipo) {
		this.codigoBarras = codigoBarras;
		this.nroMes = nroMes;
		this.monto = monto;
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	public int getNroMes() {
		return nroMes;
	}

	public double getMonto() {
		return monto;
	}

	public TipoFactura getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Factura [codigoBarras=" + codigoBarras + ", nroMes=" + nroMes + ", monto=" + monto + ", tipo=" + tipo
				+ "]";
	}

}
