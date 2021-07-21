package ar.edu.ort.p1.u5.practico05.ej03_imprimir_documentos.src;

public class Main {

	public static void main(String[] args) {

		Documento doc1 = new Documento("2021-05-18", 4);
		Documento doc2 = new Documento("2021-05-18", 3);

		/*----------------------------------------------------------------------------*/

		Impresora impresora = new Impresora(true, 10);

		impresora.agregarDocumento(doc1);
		impresora.agregarDocumento(doc2);

		impresora.imprimir(false);

		System.out.println(impresora.getCantHojasDisp());

	}

}
