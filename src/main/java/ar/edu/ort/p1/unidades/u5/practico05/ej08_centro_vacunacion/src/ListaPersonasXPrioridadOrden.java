package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaPersonasXPrioridadOrden extends ListaOrdenadaNodos<OrdenYPrioridad, PersonaEnCola> {

	@Override
	public int compare(PersonaEnCola pec1, PersonaEnCola pec2) {

		int diferencia;
		diferencia = pec1.getOrdenPrioridad().getPrioridad() - pec2.getOrdenPrioridad().getPrioridad();

		if (diferencia == 0) {
			diferencia = pec1.getOrdenPrioridad().getOrden() - pec2.getOrdenPrioridad().getOrden();
		}
		return diferencia;
	}

	/**
	 * En este caso no hace falta implementar este metodo porque no vamos a buscar
	 * elementos por OrdenYPrioridad.
	 * 
	 * Sobreescribo el compareByKey solamente porque me obliga la interface.
	 */
	@Override
	public int compareByKey(OrdenYPrioridad clave, PersonaEnCola pec) {
		// Hardcodeo un 0
		return 0;
	}

}
