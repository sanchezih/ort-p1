package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

public class ItemPedido {

	private int cant;
	private Producto producto;

	/*----------------------------------------------------------------------------*/

	public ItemPedido(int cant, Producto producto) {
		this.cant = cant;
		this.producto = producto;
	}

	/*----------------------------------------------------------------------------*/

	public Producto getProducto() {
		return producto;
	}

	public boolean hayStockSuficiente() {
		return this.cant <= this.producto.getCantEnStock();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "ItemPedido [cant=" + cant + ", producto=" + producto + "]";
	}

	public void descontarStock() {
		this.producto.descontar(this.cant);
	}

}
