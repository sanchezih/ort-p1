package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

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

		int dni2 = ciudadano2.getDni();
		int dni1 = ciudadano1.getDni();

		int res = dni2 - dni1;

		return res;
	}

	/**
	 * Siempre se ejecutara luego de que se haya ejecutado el compare, que es el que
	 * se ejecuta al momento de la insercion.
	 */
	@Override
	public int compareByKey(Integer dni, Ciudadano ciudadano) {

		int dniInt = dni.intValue();
		int dniCiudadano = ciudadano.getDni();

		int res = dniCiudadano - dniInt;

		return res;
	}

}
