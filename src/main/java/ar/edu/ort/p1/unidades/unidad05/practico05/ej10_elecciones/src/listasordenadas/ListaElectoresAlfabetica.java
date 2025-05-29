package ar.edu.ort.p1.unidades.unidad05.practico05.ej10_elecciones.src.listasordenadas;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej10_elecciones.src.Elector;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaElectoresAlfabetica extends ListaOrdenadaNodos<String, Elector> {

	@Override
	public int compare(Elector dato1, Elector dato2) {
		return dato1.getNombreCompleto().compareTo(dato2.getNombreCompleto());
	}

	@Override
	public int compareByKey(String clave, Elector elemento) {
		return clave.compareTo(elemento.getNombreCompleto());
	}

}
