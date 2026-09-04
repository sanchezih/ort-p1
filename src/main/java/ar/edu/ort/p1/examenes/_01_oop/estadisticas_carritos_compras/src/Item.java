package ar.edu.ort.p1.examenes._01_oop.estadisticas_carritos_compras.src;

public class Item implements Valuable {
	
	private int cant;
	private Producto producto;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param cant
	 * @param producto
	 */
	public Item(int cant, Producto producto) {
		this.cant = cant;
		this.producto = producto;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getPrecio() {
		return this.cant * this.producto.getPrecio();
	}

}
