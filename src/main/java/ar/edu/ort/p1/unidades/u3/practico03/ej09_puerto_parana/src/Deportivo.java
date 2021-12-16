package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Deportivo extends Embarcacion {

	private final static double INDICE_CALC_POTENCIA = 0.35;

	private int potenciaMotor;
	private int factorAerodinamico;

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	@Override
	public double precioAdicional() {
		return getValorAdicional() * (this.potenciaMotor * 0.5);
	}

	public double getConsumo() {
		return potenciaMotor / factorAerodinamico * INDICE_CALC_POTENCIA;

	}

	/**
	 * Metodo estatico
	 * 
	 * @return
	 */
	public static double GET_INDICE_CALC_POTENCIA() {
		return INDICE_CALC_POTENCIA;
	}
}
