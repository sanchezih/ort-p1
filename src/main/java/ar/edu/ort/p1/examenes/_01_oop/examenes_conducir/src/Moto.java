package ar.edu.ort.p1.examenes._01_oop.examenes_conducir.src;

public class Moto extends Vehiculo {

	private boolean tieneEspejos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param tieneEspejos
	 */
	public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
		super(patente, marca, cilindrada);
		this.tieneEspejos = tieneEspejos;
	}

}
