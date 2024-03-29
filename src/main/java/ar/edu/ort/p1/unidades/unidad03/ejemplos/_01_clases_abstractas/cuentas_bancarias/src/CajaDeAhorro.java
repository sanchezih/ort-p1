package ar.edu.ort.p1.unidades.unidad03.ejemplos._01_clases_abstractas.cuentas_bancarias.src;

public class CajaDeAhorro extends CuentaBancaria {

	private double interesesGanados;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param numero
	 * @param titular
	 */
	public CajaDeAhorro(int numero, String titular) {
		super(numero, titular);
		this.interesesGanados = 0;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param interesesGanados
	 */
	public void setInteresesGanados(double interesesGanados) {
		this.interesesGanados = interesesGanados;
	}

	/**
	 * 
	 */
	public void pagarIntereses() {
		setSaldo(getSaldo() + interesesGanados);
		interesesGanados = 0;
	}

}
