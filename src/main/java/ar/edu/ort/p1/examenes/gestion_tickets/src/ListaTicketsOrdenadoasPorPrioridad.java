package ar.edu.ort.p1.examenes.gestion_tickets.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaTicketsOrdenadoasPorPrioridad extends ListaOrdenadaNodos<Prioridad, Ticket> {

	@Override
	public int compare(Ticket elemento1, Ticket elemento2) {
		return elemento1.calcularPrioridad().compareTo(elemento2.calcularPrioridad());
	}

	@Override
	public int compareByKey(Prioridad clave, Ticket elemento) {
		return clave.compareTo(elemento.calcularPrioridad());
	}

}
