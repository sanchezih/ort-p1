package ar.edu.ort.p1.unidades.u3.ejemplos._01_clases_abstractas.cuentas_bancarias.src;

public class CajaDeAhorro extends CuentaBancaria {

	// Atributos
	private double interesesGanados;

	// Constructores
	public CajaDeAhorro(int numero, String titular) {
		super(numero, titular);
		this.interesesGanados = 0;
	}

	// Metodos
	public double getInteresesGanados() {
		return interesesGanados;
	}

	public void setInteresesGanados(double interesesGanados) {
		this.interesesGanados = interesesGanados;
	}

	public void pagarIntereses() {
		setSaldo(getSaldo()+interesesGanados);
		interesesGanados=0;
	}

}
