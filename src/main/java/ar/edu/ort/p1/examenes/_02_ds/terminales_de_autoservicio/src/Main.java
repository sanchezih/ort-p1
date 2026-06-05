package ar.edu.ort.p1.examenes._02_ds.terminales_de_autoservicio.src;

public class Main {

	public static void main(String[] args) {

		TerminalAutoServicio terminal = new TerminalAutoServicio();

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio B

		// Se puede depositar porque el anio es > 2010 y el nro es > a 2000000
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteNacional(2000999, 'A', 2012, Estado.MALO, Valor.CINCUENTA)));

		// No se puede depositar porque el anio es < 2010 aunque el nro sea > 2000000
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteNacional(2000003, 'A', 2009, Estado.BUENO, Valor.CIEN)));

		// No se puede depositar porque el nro es < 2000000
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteNacional(180590, 'A', 2009, Estado.BUENO, Valor.CIEN)));

		// No se puede depositar porque el nro es < 2000000
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteNacional(180590, 'A', 2015, Estado.BUENO, Valor.CIEN)));

		// Se puede depositar porque el nro es > a 2000000, la letra no es 'C' y el
		// valor de la banda coincide con el valor
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteDolar(2000666, 'D', 2014, Estado.BUENO, Valor.CIEN, "CIEN")));

		// No se puede depositar porque la letra no es 'C' aunque lo demas este ok
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteDolar(2350350, 'C', 2015, Estado.BUENO, Valor.CINCUENTA, "CINCUENTA")));

		// Se puede depositar ok
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteDolar(2111111, 'D', 2014, Estado.BUENO, Valor.DIEZ, "DIEZ")));

		// Se puede depositar porque el anio es > 2010 y el nro es > a 2000000
		System.out.println("Puedo depositar este billete? -> "
				+ terminal.depositar(new BilleteNacional(2000888, 'A', 2015, Estado.REGULAR, Valor.CINCUENTA)));

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio C
		terminal.mostarMatriz();

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio D
		terminal.mostrarBilletes();

	}

}
