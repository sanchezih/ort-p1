package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaPersonasXPrioridadOrden extends ListaOrdenadaNodos<OrdenYPrioridad, PersonaEnCola> {

	@Override
	public int compare(PersonaEnCola dato1, PersonaEnCola dato2) {
		int dif;
		dif = dato1.getOrdPri().getPrioridad() - dato2.getOrdPri().getPrioridad();
		if (dif == 0) {
			dif = dato1.getOrdPri().getOrden() - dato2.getOrdPri().getOrden();
		}
		return dif;
	}

	@Override
	public int compareByKey(OrdenYPrioridad clave, PersonaEnCola elemento) {
		// no se va a buscar elementos por OrdenYPrioridad
		return 0;
	}

}
