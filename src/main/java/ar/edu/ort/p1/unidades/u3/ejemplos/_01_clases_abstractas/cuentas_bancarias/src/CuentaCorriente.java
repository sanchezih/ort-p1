package ar.edu.ort.p1.unidades.u3.ejemplos._01_clases_abstractas.cuentas_bancarias.src;

public class CuentaCorriente extends CuentaBancaria {

	private double descubierto;

	/**
	 * 
	 * @param numero
	 * @param titular
	 * @param descubierto
	 */
	public CuentaCorriente(int numero, String titular, double descubierto) {
		super(numero, titular);
		this.descubierto = descubierto;
	}

	/**
	 * 
	 * @param numero
	 * @param titular
	 */
	public CuentaCorriente(int numero, String titular) {
		this(numero, titular, 0);
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	/**
	 * 
	 */
	@Override
	public boolean extraer(double monto) {
		if (monto > getSaldo() + descubierto) {
			return false;
		} else {
			setSaldo(getSaldo() - monto);
			return true;
		}
	}

}
