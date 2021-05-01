package tp3.tp3_cabinas_peaje.src;

public class Vehiculo {
	private int patente;
	private CategoriaVehiculo categoria;

	public Vehiculo(int patente, CategoriaVehiculo categoria) {
		super();
		this.patente = patente;
		this.categoria = categoria;
	}

	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public CategoriaVehiculo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaVehiculo categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "[patente=" + patente + "]";
	}

}
