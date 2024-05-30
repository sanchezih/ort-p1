package ar.edu.ort.p1.examenes._02_ds.gestor_incidentes.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeTicketsOrdenadosPorPrioridad extends ListaOrdenadaNodos<Prioridad, Ticket> {

	@Override
	public int compare(Ticket t1, Ticket t2) {
		return t1.calcularPrioridad().ordinal() - t2.calcularPrioridad().ordinal();
	}

	@Override
	public int compareByKey(Prioridad p, Ticket t) {
		return p.ordinal() - t.calcularPrioridad().ordinal();
	}

}
