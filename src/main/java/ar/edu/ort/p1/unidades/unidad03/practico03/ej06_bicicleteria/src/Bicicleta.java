package ar.edu.ort.p1.unidades.unidad03.practico03.ej06_bicicleteria.src;

public class Bicicleta {

	private static int KM_MAX_PERMITIDO = 2000;
	
	private String marca;
	private String modelo;
	private double kilometraje;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param marca
	 * @param modelo
	 * @param kilometraje
	 */
	public Bicicleta(String marca, String modelo, double kilometraje) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public boolean isReparable() {
		return this.kilometraje < KM_MAX_PERMITIDO;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	
}
