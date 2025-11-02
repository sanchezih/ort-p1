package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class MultasPorGravedad extends ListaOrdenadaNodos<Gravedad, Multa> {

	@Override
	public int compare(Multa m1, Multa m2) {
		return m1.getGravedad().ordinal() - m2.getGravedad().ordinal();
	}

	@Override
	public int compareByKey(Gravedad g, Multa m) {
		return g.ordinal() - m.getGravedad().ordinal();
	}

}
