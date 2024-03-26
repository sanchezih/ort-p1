package ar.edu.ort.p1.unidades.unidad02.ejemplos._05_palabra_super._01_en_variables.src;

public class Automovil extends Vehiculo {

	private int velocidadMaxima = 180;

	/*----------------------------------------------------------------------------*/

	/**
	 * Imprime velocidadMaxima de la clase base (Vehiculo)
	 */
	public void display() {
		System.out.println("Velocidad maxima: " + super.velocidadMaxima);
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
}
