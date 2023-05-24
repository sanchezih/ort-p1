package ar.edu.ort.p1.unidades.u5.practico05.ej03_impresora.src;

import ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._03_cola._01_impl_array.src.ColaArray;

public class ColaDeDocumentos extends ColaArray<Documento> {

	public ColaDeDocumentos(Class<Documento> tipo) {
		super(tipo);
	}

	public ColaDeDocumentos(Class<Documento> tipo, int tope) {
		super(tipo, tope);
	}
}
