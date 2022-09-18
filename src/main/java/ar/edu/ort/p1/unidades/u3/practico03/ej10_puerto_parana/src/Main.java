package ar.edu.ort.p1.unidades.u3.practico03.ej10_puerto_parana.src;

public class Main {

	public static void main(String[] args) {

		Puerto puertoParana = new Puerto();

		System.out.println(puertoParana.mostrar());

		System.out.println();

		// Test ejercicio B
		System.out.println(
				"Ejercicio B: La cantidad de embarcaciones que abonan un importe mayor a $50 en concepto de alquiler de su amarra es: "
						+ puertoParana.barcosConAlquilerMayorA(50));

		// Test ejercicio C
		System.out.println("\nEjercicio C: El barco deportivo (de lujo o no) de mayor consumo en todo el puerto es: "
				+ puertoParana.barcoConMayorConsumo());

	}
}