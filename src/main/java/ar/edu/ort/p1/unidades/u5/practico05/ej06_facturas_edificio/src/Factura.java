package ar.edu.ort.p1.unidades.u5.practico05.ej06_facturas_edificio.src;

public class Factura {

	private String codigoBarras;
	private int nroMes;
	private double monto;
	private TipoFactura tipo;

	/*----------------------------------------------------------------------------*/

	// Constructores

	public Factura(String codigoBarras, int nroMes, double monto, TipoFactura tipo) {
		super();
		this.codigoBarras = codigoBarras;
		this.nroMes = nroMes;
		this.monto = monto;
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public int getNroMes() {
		return nroMes;
	}

	public void setNroMes(int nroMes) {
		this.nroMes = nroMes;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public TipoFactura getTipo() {
		return tipo;
	}

	public void setTipo(TipoFactura tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Factura [codigoBarras=" + codigoBarras + ", nroMes=" + nroMes + ", monto=" + monto + ", tipo=" + tipo
				+ "]";
	}

}
