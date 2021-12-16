package ar.edu.ort.p1.unidades.u1.practico01.ej06_amazonia.src;

public class ItemPedido {

	private int cant;
	private Producto producto;

	public ItemPedido(int cant, Producto producto) {
		this.cant = cant;
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public boolean hayStockSuficiente() {
		return this.cant <= this.producto.getCantEnStock();
	}

	/*----------------------------------------------------------------------------*/

	public void descontarStock() {
		this.producto.descontar(this.cant);
	}

}
