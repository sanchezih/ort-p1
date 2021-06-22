package edu.ort.p1.extra.exa._2021c1._2p.tema2.leon.src;

public class Item {

	private int cantProducto;
	private Producto producto;

	public Item(int cantProducto, Producto producto) {
		super();
		this.cantProducto = cantProducto;
		this.producto = producto;
	}

	public int getCantProducto() {
		return cantProducto;
	}

	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
