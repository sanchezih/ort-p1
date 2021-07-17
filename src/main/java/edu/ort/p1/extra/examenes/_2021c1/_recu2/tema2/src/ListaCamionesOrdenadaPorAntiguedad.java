package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaCamionesOrdenadaPorAntiguedad extends ListaOrdenadaNodos<Integer, Camion> {

	@Override
	public int compare(Camion c1, Camion c2) {

		/**
		 * Si se desea ordenar de mayor a menor antiguedad teniendo los anios de
		 * fabricacion, entonces es ASCENDENTE. El de menor anio es el mas antiguo.
		 * Tambien se podria ordenar por antiguedad DESCENDENTE, pero implica volver a
		 * usar Fecha.aniosHastaHoy(), lo que lo vuelve mas lento
		 */
		return c1.getAnioFabricacion() - c2.getAnioFabricacion();
	}

	@Override
	public int compareByKey(Integer anioFabricacion, Camion c) {
		return anioFabricacion - c.getAnioFabricacion();
	}

}
