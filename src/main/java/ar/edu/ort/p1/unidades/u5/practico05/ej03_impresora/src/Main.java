package ar.edu.ort.p1.unidades.u5.practico05.ej03_impresora.src;

public class Main {

	public static void main(String[] args) {

		Documento doc1 = new Documento("2021-05-18", 5, true); // Consume 3 hojas
		Documento doc2 = new Documento("2021-05-18", 4, false); // Consume 4 hojas
		Documento doc3 = new Documento("2021-07-09", 1, false); // Consume 1 hojas

		/*----------------------------------------------------------------------------*/

		// Creo una impresora con 10 hojas disponibles
		Impresora impresora = new Impresora(true, 10);
		System.out.println("Al momento, la impresora tiene " + impresora.getCantHojasDisp() + " hojas disponibles");

		// Test ejercicio B
		impresora.agregarDocumento(doc1);
		impresora.agregarDocumento(doc2);
		impresora.agregarDocumento(doc3);
		System.out.println();

		// Test ejercicio C
		System.out.println((impresora.imprimir() ? "IMPRESORA: Pudo imprimir" : "IMPRESORA: No pudo imprimir"));
		System.out.println();

		System.out.println("Al momento, la impresora tiene " + impresora.getCantHojasDisp() + " hojas disponibles");
	}

}
