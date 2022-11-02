package ar.edu.ort.p1.unidades.u4.practico04.ej06_frigorifico.src;

public class ItemPedido {
	private int cantidad;
	private Producto producto;

	public ItemPedido(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double costo() {
		return this.cantidad * this.producto.getPrecio();
	}

}
