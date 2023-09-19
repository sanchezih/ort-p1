package ar.edu.ort.p1.examenes.oop.estadisticas_carritos_compras.src;

public class Producto implements Valuable {

	private String id;
	private double precio;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param id
	 * @param precio
	 */
	public Producto(String id, double precio) {
		this.id = id;
		this.precio = precio;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getPrecio() {
		return this.precio;
	}

}
