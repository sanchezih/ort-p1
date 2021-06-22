package edu.ort.p1.extra.exa._2021c1._2p.tema2.leon.src;

public class Producto {

	private int codProducto;
	private double precio;
	private boolean Esencial;

	public Producto(int codProducto, double precio, boolean esencial) {
		super();
		this.codProducto = codProducto;
		this.precio = precio;
		Esencial = esencial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsencial() {
		return Esencial;
	}

	public void setEsencial(boolean esencial) {
		Esencial = esencial;
	}

}
