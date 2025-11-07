package ar.edu.ort.p1.examenes._02_ds.gestor_reclamos_afip.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeCiudadanosPorDniDesc extends ListaOrdenadaNodos<Integer, Ciudadano> {

	/**
	 * Este metodo es invocado al momento de insertar un elemento en la lista
	 * 
	 * Si trabajo con una lista ordenada ASC: param1 - param2
	 * 
	 * Si trabajo con una lista ordenada DESC: param2 - param1
	 */
	@Override
	public int compare(Ciudadano ciudadano1, Ciudadano ciudadano2) {
		return ciudadano2.getDni() - ciudadano1.getDni();
	}

	/**
	 * Siempre se ejecutara luego de que se haya ejecutado el compare, que es el que
	 * se ejecuta al momento de la insercion.
	 */
	@Override
	public int compareByKey(Integer dni, Ciudadano ciudadano) {
		return ciudadano.getDni() - dni.intValue();
	}

}
