package ar.edu.ort.p1.unidades.u5.practico05.ej10_elecciones.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaDeMesas extends ListaOrdenadaNodos<Integer, Mesa> {

	@Override
	public int compare(Mesa dato1, Mesa dato2) {
		return dato1.getNumero() - dato2.getNumero();
	}

	@Override
	public int compareByKey(Integer clave, Mesa elemento) {
		return clave - elemento.getNumero();
	}

}
