package edu.ort.u5.tp5.ej03_imprimir_documentos;

public class Main {

	public static void main(String[] args) {
	Impresora impresora = new Impresora(true, 10);
		Documento doc1 = new Documento("2021-05-18", 4);
		Documento doc2 = new Documento("2021-05-18", 7);
		
		
	
		impresora.agregarDocumento(doc1);
		impresora.agregarDocumento(doc2);
		impresora.imprimir(false);
		System.out.println(impresora.getCantHojasDisp());

	}

}
