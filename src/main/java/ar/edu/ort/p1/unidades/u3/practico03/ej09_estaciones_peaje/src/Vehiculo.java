package ar.edu.ort.p1.unidades.u3.practico03.ej09_estaciones_peaje.src;

public class Vehiculo {

	private int patente;
	private Categoria categoria;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(int patente, Categoria categoria) {
		this.patente = patente;
		this.categoria = categoria;
	}

	/*----------------------------------------------------------------------------*/

	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "[patente=" + patente + "]";
	}

}
