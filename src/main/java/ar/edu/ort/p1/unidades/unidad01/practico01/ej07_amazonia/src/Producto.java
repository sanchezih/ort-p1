package ar.edu.ort.p1.unidades.unidad01.practico01.ej07_amazonia.src;

public class Producto {

	private String nombre;
	private double precioUnitario;
	private int cantEnStock;

	/*----------------------------------------------------------------------------*/

	public Producto(String nombre, double precioUnitario, int cantEnStock) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantEnStock = cantEnStock;
	}

	/*----------------------------------------------------------------------------*/

	public int getCantEnStock() {
		return this.cantEnStock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + this.precioUnitario + ", cantEnStock="
				+ this.cantEnStock + "]";
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void descontarDelStock(int cantidad) {
		int restante = this.cantEnStock - cantidad;

		if (restante >= 0) {
			this.cantEnStock = restante;
		}
	}

}
