package ar.edu.ort.p1.unidades.unidad03.practico03.ej06_bicicleteria.src;

public class BicicletaElectrica extends Bicicleta {

	private static int POTENCIA_MAX_PERMITIDA = 250;

	private double potencia;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param marca
	 * @param modelo
	 * @param kilometraje
	 * @param potencia
	 */
	public BicicletaElectrica(String marca, String modelo, double kilometraje, double potencia) {
		super(marca, modelo, kilometraje);
		this.potencia = potencia;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public boolean isReparable() {

		// Para punto B
		return this.potencia < POTENCIA_MAX_PERMITIDA;

		// Para punto C
		// return super.isReparable() && this.potencia <= POTENCIA_MAX_PERMITIDA;
	}

	/**
	 * 
	 * @return
	 */
	public double getPotencia() {
		return potencia;
	}

}
