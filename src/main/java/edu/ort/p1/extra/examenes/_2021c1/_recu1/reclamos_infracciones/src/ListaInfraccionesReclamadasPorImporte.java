package edu.ort.p1.extra.examenes._2021c1._recu1.reclamos_infracciones.src;

import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaInfraccionesReclamadasPorImporte extends ListaOrdenadaNodos<Double, Infraccion> {

	@Override
	public int compare(Infraccion i1, Infraccion i2) {
		return (int) (i1.valorInfraccion() - i2.valorInfraccion());
	}

	@Override
	public int compareByKey(Double clave, Infraccion i) {
		return (int) (clave - i.valorInfraccion());
	}

}
