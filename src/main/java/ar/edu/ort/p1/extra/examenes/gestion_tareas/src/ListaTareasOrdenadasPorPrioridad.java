package ar.edu.ort.p1.extra.examenes.gestion_tareas.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaTareasOrdenadasPorPrioridad extends ListaOrdenadaNodos<Prioridad, Tarea> {

	@Override
	public int compare(Tarea elemento1, Tarea elemento2) {
		return elemento1.calcularPrioridad().compareTo(elemento2.calcularPrioridad());
	}

	@Override
	public int compareByKey(Prioridad clave, Tarea elemento) {
		return clave.compareTo(elemento.calcularPrioridad());
	}

}
