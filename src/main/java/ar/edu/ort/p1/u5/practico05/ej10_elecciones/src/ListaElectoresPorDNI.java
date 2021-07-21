package ar.edu.ort.p1.u5.practico05.ej10_elecciones.src;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaElectoresPorDNI extends ListaOrdenadaNodos<Integer, Elector> {

	@Override
	public int compare(Elector dato1, Elector dato2) {
		return dato1.getDni() - dato2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, Elector elemento) {
		return clave - elemento.getDni();
	}

}
