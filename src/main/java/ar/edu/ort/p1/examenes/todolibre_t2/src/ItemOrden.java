package ar.edu.ort.p1.examenes.todolibre_t2.src;

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
