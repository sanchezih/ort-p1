package edu.ort.p1.extra.examenes._2021c1._2p.tema1.resuelto.src;

public abstract class Orden implements Entregable {
	private long numero;
	private String fecha;
	private double monto;
	private Usuario vendedor;
	private Usuario comprador;

	public Orden(long numero, String fecha, double monto, Usuario vendedor, Usuario comprador) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.monto = monto;
		this.vendedor = vendedor;
		this.comprador = comprador;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Usuario getComprador() {
		return comprador;
	}

	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}

	@Override
	public Domicilio getDomicilioOrigen() {
		return this.vendedor.getDomicilio();

	}

	@Override
	public String toString() {
		return "Orden [numero=" + numero + ", monto=" + monto + "]";
	}

}
