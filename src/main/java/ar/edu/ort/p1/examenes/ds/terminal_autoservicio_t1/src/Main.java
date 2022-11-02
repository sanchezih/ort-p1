package ar.edu.ort.p1.examenes.ds.terminal_autoservicio_t1.src;

public class Main {

	public static void main(String[] args) {

		TerminalAutoServicio terminal = new TerminalAutoServicio();

		// Test Ejercicio B

		// Se puede depositar
		terminal.depositar(new BilleteNacional(2000004, 'A', 2011, Estado.BUENO, Valor.CIEN));

		// No se puede depositar
		terminal.depositar(new BilleteNacional(2000003, 'A', 2011, Estado.BUENO, Valor.CIEN));

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio C
		terminal.cantBilletesPorEstadoYValor();

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio D
		terminal.listarBilletesOrdenadosPorValor();

	}

}
