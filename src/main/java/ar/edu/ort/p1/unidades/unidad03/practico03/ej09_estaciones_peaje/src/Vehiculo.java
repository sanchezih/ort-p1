package ar.edu.ort.p1.unidades.unidad03.practico03.ej09_estaciones_peaje.src;

public class Vehiculo {

	private int patente;
	private Categoria categoria;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(int patente, Categoria categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}

	/*----------------------------------------------------------------------------*/

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "[patente=" + patente + "]";
	}

}
