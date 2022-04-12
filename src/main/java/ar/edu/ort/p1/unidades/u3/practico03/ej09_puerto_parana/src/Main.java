package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class Main {

	public static void main(String[] args) {

		Puerto puertoParana = new Puerto();

		// Test ejercicio B
		System.out.println(
				"La cantidad de embarcaciones que abonan un importe mayor al indicado en concepto de alquiler de su amarra es: "
						+ puertoParana.barcosConAlquilerMayorA(50));

		// Test ejercicio C
		System.out.println("\nEl barco deportivo (de lujo o no) de mayor consumo en todo el puerto es: "
				+ puertoParana.barcoConMayorConsumo());

	}
}