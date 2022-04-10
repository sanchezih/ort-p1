package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Deportivo extends Embarcacion {

	private final static double INDICE_CALC_POTENCIA = 0.35;

	private int potenciaMotor;
	private int factorAerodinamico;

	public Deportivo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.potenciaMotor = potenciaMotor;
		this.factorAerodinamico = factorAerodinamico;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por el 50% de la potencia
	 */
	@Override
	public double precioAdicional() {
		return getValorAdicional() * (this.potenciaMotor * 0.5);
	}

	/*----------------------------------------------------------------------------*/

	public double calcularConsumo() {
		return potenciaMotor / factorAerodinamico * INDICE_CALC_POTENCIA;

	}

	/**
	 * Metodo estatico
	 * 
	 * @return
	 */
	public static double GET_INDICE_CALCULO_POTENCIA() {
		return INDICE_CALC_POTENCIA;
	}
}
