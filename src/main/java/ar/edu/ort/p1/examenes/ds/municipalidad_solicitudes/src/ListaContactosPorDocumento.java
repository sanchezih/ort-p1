package ar.edu.ort.p1.examenes.ds.municipalidad_solicitudes.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaContactosPorDocumento extends ListaOrdenadaNodos<String, Contacto> {

	@Override
	public int compare(Contacto c1, Contacto c2) {
		return c1.getDni().compareTo(c2.getDni());
	}

	@Override
	public int compareByKey(String dni, Contacto c) {
		return dni.compareTo(c.getDni());
	}

}
