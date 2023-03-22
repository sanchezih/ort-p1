package ar.edu.ort.p1.unidades.u1.practico01.ej07_amazonia.src;

public class Producto {

	private String nombre;
	private double precioUnitario;
	private int cantEnStock;

	/*----------------------------------------------------------------------------*/

	public Producto(String nombre, double precioUnitario, int cantEnStock) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantEnStock = cantEnStock;
	}

	/*----------------------------------------------------------------------------*/

	public int getCantEnStock() {
		return cantEnStock;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", cantEnStock=" + cantEnStock
				+ "]";
	}

	/**
	 * 
	 * @param cant
	 */
	public void descontar(int cant) {
		int restante;
		restante = this.cantEnStock - cant;
		if (restante >= 0) {
			this.cantEnStock = restante;
		}
	}

}
