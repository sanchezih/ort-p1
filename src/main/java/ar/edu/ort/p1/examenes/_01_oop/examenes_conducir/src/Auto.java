package ar.edu.ort.p1.examenes._01_oop.examenes_conducir.src;

public class Auto extends Vehiculo {

	private int cantPuertas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param cantPuertas
	 */
	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}

}
