package edu.ort.cdv.u6.ejercicios.transportista.clases;

import edu.ort.cdv.u6.tad.ListaOrdenada;

public class ListaChoferes extends ListaOrdenada<Integer, Chofer> {

	@Override
	protected int compare(Chofer chofer1, Chofer chofer2) {
		return chofer1.getDni() - chofer2.getDni();
	}

	@Override
	protected int compareByKey(Integer clave, Chofer chofer) {
		return clave - chofer.getDni();
	}

}
