package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._01_vehiculos.src;

/**
 * Clase que representa un vehiculo cualquiera
 */
public class Vehiculo {

	// Atributos
	private Color color;
	private final int numSerie; // Una vez grabado el nro de serie de un vehiculo, no se deberia modificar

	// Constructor
	public Vehiculo(Color color, int numSerie) {
		this.color = color;
		this.numSerie = numSerie;
	}

	// Metodos
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getNumSerie() {
		return numSerie;
	}

	// No tendremos un setter para numero de serie porque es final

//	public void setNumSerie(int numSerie) {
//		this.numSerie = numSerie;
//	}

}