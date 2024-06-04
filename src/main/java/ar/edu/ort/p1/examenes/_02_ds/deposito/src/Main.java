package ar.edu.ort.p1.examenes._02_ds.deposito.src;

public class Main {

	public static void main(String[] args) {

		Deposito deposito = new Deposito();

		// Test Ejercicio C
		int[] informe = deposito.getInformeDePrioridades();

		for (int i = 0; i < informe.length; i++) {
			System.out.println(Prioridad.values()[i] + ": " + informe[i]);
		}

		// Test Ejercicio D
		deposito.ingresarProducto(new Producto("Bolsa de cemento1", "Rosario", 50));
		deposito.ingresarProducto(new Producto("Bolsa de arena2", "Buenos Aires", 75));
		deposito.ingresarProducto(new Producto("Bolsa de arena3", "Rosario", 15));
		deposito.ingresarProducto(new Producto("Bolsa de arena", "Rosario", 20));

		System.out.println("FIN");

	}

}
