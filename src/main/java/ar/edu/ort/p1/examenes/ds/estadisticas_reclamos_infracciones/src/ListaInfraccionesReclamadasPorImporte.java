package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

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
