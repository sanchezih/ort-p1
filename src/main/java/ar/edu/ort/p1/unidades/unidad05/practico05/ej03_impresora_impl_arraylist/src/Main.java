package ar.edu.ort.p1.unidades.unidad05.practico05.ej03_impresora_impl_arraylist.src;

public class Main {

	public static void main(String[] args) {

		// Creo una impresora con 100 hojas disponibles
		Impresora impresora = new Impresora(true, 100);
		System.out.println("Al momento, la impresora tiene " + impresora.getCantHojasDisp() + " hojas disponibles");

		System.out.println();

		// Test ejercicio B
		impresora.agregarDocumento(new Documento("2021-05-18", 5, true)); // Consume 3 hojas
		impresora.agregarDocumento(new Documento("2021-05-18", 4, false)); // Consume 4 hojas
		impresora.agregarDocumento(new Documento("2021-07-09", 1, false)); // Consume 1 hojas
		impresora.agregarDocumento(new Documento("2021-07-09", 3, false)); // Consume 3 hojas
		impresora.agregarDocumento(new Documento("2021-07-09", 3, true)); // Consume 2 hojas

		System.out.println();

		// Test ejercicio C
		System.out.println((impresora.imprimir() ? "IMPRESORA: Pudo imprimir OK!" : "IMPRESORA: No pudo imprimir"));
		System.out.println();

		System.out.println("Al momento, la impresora tiene " + impresora.getCantHojasDisp() + " hojas disponibles");
	}

}
