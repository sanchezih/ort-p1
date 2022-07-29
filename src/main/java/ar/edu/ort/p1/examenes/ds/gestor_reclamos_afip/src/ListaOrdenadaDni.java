package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaOrdenadaDni extends ListaOrdenadaNodos<Integer, Ciudadano> {

	@Override
	public int compare(Ciudadano c, Ciudadano c2) {
		return c.getDni() - c2.getDni();
	}

	@Override
	public int compareByKey(Integer clave, Ciudadano c) {
		return clave.intValue() - c.getDni();
	}

}
