package ar.edu.ort.p1.examenes._02_ds.deposito.src;

public class ItemPedido {

	private int cantidad;
	private Producto producto;

	/*----------------------------------------------------------------------------*/

	public ItemPedido(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}

	/*----------------------------------------------------------------------------*/

	public int getCantidad() {
		return cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public String getNombreProducto() {
		return this.getProducto().getNombre();
	}

}
