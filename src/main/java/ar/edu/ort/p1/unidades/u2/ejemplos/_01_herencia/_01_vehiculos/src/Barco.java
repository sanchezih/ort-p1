package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._01_vehiculos.src;

public class Barco extends Vehiculo {

	/**
	 * Los constructores no se heredan, las subclases deben definir su propio
	 * constructor.
	 * 
	 * Sera necesario inicializar los atributos de la superclase, para ello se llama
	 * a su constructor desde la subclase con super().
	 * 
	 * @param color
	 * @param numSerie
	 */
	public Barco(Color color, int numSerie) {
		super(color, numSerie);
	}
}