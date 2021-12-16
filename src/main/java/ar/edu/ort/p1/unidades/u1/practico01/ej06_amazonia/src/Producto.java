package ar.edu.ort.p1.unidades.u1.practico01.ej06_amazonia.src;

public class Producto {

	private String nombre;
	private double precioUnitario;
	private int cantEnStock;

	public int getCantEnStock() {
		return cantEnStock;
	}

	/*----------------------------------------------------------------------------*/

	public void descontar(int cant) {
		int restante;
		restante = this.cantEnStock - cant;
		if (restante >= 0) {
			this.cantEnStock = restante;
		}
	}

}
