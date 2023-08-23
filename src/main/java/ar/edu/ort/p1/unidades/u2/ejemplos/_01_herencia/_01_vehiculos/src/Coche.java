package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._01_vehiculos.src;

public class Coche extends Vehiculo {

	private int cilindrada;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param color
	 * @param numSerie
	 * @param cilindrada
	 */
	public Coche(Color color, int numSerie, int cilindrada) {
		super(color, numSerie);
		this.cilindrada = cilindrada;
	}

	/*----------------------------------------------------------------------------*/

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}