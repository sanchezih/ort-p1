package ar.edu.ort.p1.unidades.unidad03.practico03.ej10_puerto_parana.src;

public class Deportivo extends Embarcacion {

	private final static double INDICE_CALCULO_POTENCIA = 0.35;

	private int potenciaMotor;
	private int factorAerodinamico;

	/**
	 * 
	 * @param matricula
	 * @param eslora
	 * @param anioFabricacion
	 * @param duenio
	 * @param valorBase
	 * @param valorAdicional
	 * @param potenciaMotor
	 * @param factorAerodinamico
	 */
	public Deportivo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.potenciaMotor = potenciaMotor;
		this.factorAerodinamico = factorAerodinamico;
	}

	public int getPotenciaMotor() {
		return this.potenciaMotor;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por el 50% de la potencia
	 */
	@Override
	public double getPrecioAdicional() {
		return getValorAdicional() * (this.potenciaMotor * 0.5);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public double calcularConsumo() {
		return this.potenciaMotor / this.factorAerodinamico * INDICE_CALCULO_POTENCIA;
	}

	/**
	 * Metodo estatico
	 * 
	 * @return
	 */
	public static double GET_INDICE_CALCULO_POTENCIA() {
		return INDICE_CALCULO_POTENCIA;
	}
}
