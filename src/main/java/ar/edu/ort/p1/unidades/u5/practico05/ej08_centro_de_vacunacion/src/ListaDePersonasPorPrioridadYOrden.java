package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_de_vacunacion.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

/**
 * La clase que extiende de ListaOrdenadaNodos, debera implementar los metodos
 * compare y compareByKey
 * 
 * Estos metodos no los usaremos en forma directa, sino que sera la propia lista
 * ordenada la encargada de invocarlos.
 * 
 * @author ihsanch
 *
 */
public class ListaDePersonasPorPrioridadYOrden extends ListaOrdenadaNodos<PrioridadYOrden, PersonaEnCola> {

	/**
	 * Metodo que invocara internamente la lista desde el metodo add para decidir en
	 * que posicion insertar un elemento
	 */
	@Override
	public int compare(PersonaEnCola pec1, PersonaEnCola pec2) {

		int diferencia = pec1.getPrioridadYOrden().getPrioridad() - pec2.getPrioridadYOrden().getPrioridad();

		if (diferencia == 0) {
			diferencia = pec1.getPrioridadYOrden().getOrden() - pec2.getPrioridadYOrden().getOrden();
		}
		return diferencia;
	}

	/**
	 * Metodo que invocara internamente la lista desde los metodos exists, search y
	 * searcByKey.
	 * 
	 * En este caso se puede implementar el metodo normalmente o, como no vamos a
	 * buscar elementos por PrioridadYOrden, se puede directamente poner return 0.
	 *
	 */
	@Override
	public int compareByKey(PrioridadYOrden prioridadYOrden, PersonaEnCola pec) {

		int diferencia = pec.getPrioridadYOrden().getPrioridad() - prioridadYOrden.getPrioridad();

		if (diferencia == 0) {
			diferencia = prioridadYOrden.getOrden() - pec.getPrioridadYOrden().getOrden();
		}

		return diferencia;
		// return 0;
	}

}
