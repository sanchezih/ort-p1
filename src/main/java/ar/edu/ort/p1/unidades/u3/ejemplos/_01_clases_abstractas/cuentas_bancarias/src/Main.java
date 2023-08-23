package ar.edu.ort.p1.unidades.u3.ejemplos._01_clases_abstractas.cuentas_bancarias.src;

public class Main {

	private static CajaDeAhorro cajaDeAhorro;
	private static CuentaCorriente cuentaCorriente;

	public static void main(String[] args) {
		testDeposito();
		testExtraccionSinSaldo();
		testExtraccionConSaldo();
		testCambios();
	}

	/**
	 * 
	 */
	private static void testCambios() {
		reiniciar();
		cajaDeAhorro.setInteresesGanados(150);
		cajaDeAhorro.pagarIntereses();
		cuentaCorriente.setDescubierto(100);
		chequearIgualdad(150, cajaDeAhorro.getSaldo(), 1E-4);
		chequearIgualdad(100, cuentaCorriente.getDescubierto(), 1E-4);
	}

	/**
	 * 
	 */
	private static void testExtraccionConSaldo() {
		reiniciar();
		cajaDeAhorro.depositar(500);
		cuentaCorriente.depositar(500);
		boolean okCA = cajaDeAhorro.extraer(100);
		boolean okCC = cuentaCorriente.extraer(100);
		chequearIgualdad(true, okCA);
		chequearIgualdad(true, okCC);
		chequearIgualdad(400, cajaDeAhorro.getSaldo(), 1E-4);
		chequearIgualdad(400, cuentaCorriente.getSaldo(), 1E-4);
	}

	/**
	 * 
	 */
	private static void testExtraccionSinSaldo() {
		reiniciar();
		boolean okCA = cajaDeAhorro.extraer(1000);
		boolean okCC = cuentaCorriente.extraer(1000);
		chequearIgualdad(false, okCA);
		chequearIgualdad(true, okCC);
		chequearIgualdad(0, cajaDeAhorro.getSaldo(), 1E-4);
		chequearIgualdad(-1000, cuentaCorriente.getSaldo(), 1E-4);
	}

	/**
	 * 
	 */
	private static void testDeposito() {
		reiniciar();
		cajaDeAhorro.depositar(500);
		cuentaCorriente.depositar(500);
		chequearIgualdad(500, cajaDeAhorro.getSaldo(), 1E-4);
		chequearIgualdad(500, cuentaCorriente.getSaldo(), 1E-4);

	}

	/**
	 * 
	 */
	private static void reiniciar() {
		cajaDeAhorro = new CajaDeAhorro(1234, "Juan Perez");
		cuentaCorriente = new CuentaCorriente(5678, "Ana Garcia", 1000);

	}

	/**
	 * 
	 * @param valorEsperado
	 * @param valorObtenido
	 * @param tolerancia
	 */
	private static void chequearIgualdad(double valorEsperado, double valorObtenido, double tolerancia) {
		boolean ok = Math.abs(valorEsperado - valorObtenido) < tolerancia;
		if (ok) {
			System.out.println("OK");
		} else {
			System.out.println("ERROR: Se esperaba el valor ");
			System.out.println(valorEsperado);
			System.out.println(" y se obtuvo ");
			System.out.println(valorObtenido);
		}
	}

	/**
	 * 
	 * @param valorEsperado
	 * @param valorObtenido
	 */
	private static void chequearIgualdad(boolean valorEsperado, boolean valorObtenido) {
		if (valorEsperado == valorObtenido) {
			System.out.println("OK");
		} else {
			System.out.println("ERROR: Se esperaba el valor ");
			System.out.println(valorEsperado);
			System.out.println(" y se obtuvo ");
			System.out.println(valorObtenido);
		}

	}

}
