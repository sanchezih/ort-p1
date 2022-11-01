package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaOrdenadaDniDesc extends ListaOrdenadaNodos<Integer, Ciudadano> {

	/**
	 * Este metodo es invocado al momento de insertar un elemento en la lista
	 * 
	 * Si trabajo con una lista ordenada ASC: param1 - param2
	 * 
	 * Si trabajo con una lista ordenada DESC: param2 - param1
	 */
	@Override
	public int compare(Ciudadano c1, Ciudadano c2) {

		int dni2 = c2.getDni();
		int dni1 = c1.getDni();

		int res = dni2 - dni1;

		return res;
	}

	/**
	 * Siempre se ejecutara luego de que se haya ejecutado el compare, que es el que
	 * se ejecuta al momento de la insercion.
	 */
	@Override
	public int compareByKey(Integer clave, Ciudadano ciudadano) {

		int claveInt = clave.intValue();
		int dni = ciudadano.getDni();

		int res = dni - claveInt;

		return res;
	}

}
