package edu.ort.p1.extra.examenes._2021c1._2p.tema2.resuelto.src;

public class ItemOrden {

	private int cantidad;
	private Producto producto;
	
	

	public ItemOrden(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getPrioridad() {
		return this.producto.getPrioridad();
	}

	public double precioTotal() {
		return this.cantidad * this.producto.getPrecio();
	}

}
