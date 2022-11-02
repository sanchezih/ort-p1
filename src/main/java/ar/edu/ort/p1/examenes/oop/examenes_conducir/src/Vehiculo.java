package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

public abstract class Vehiculo {

	private String patente;
	private String marca;
	private int cilindrada;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(String patente, String marca, int cilindrada) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}

	/*----------------------------------------------------------------------------*/

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", cilindrada=" + cilindrada + "]";
	}

}
