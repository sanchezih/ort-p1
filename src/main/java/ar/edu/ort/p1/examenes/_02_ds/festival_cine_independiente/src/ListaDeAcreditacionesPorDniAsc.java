package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeAcreditacionesPorDniAsc extends ListaOrdenadaNodos<Integer, Acreditacion> {

	public ListaDeAcreditacionesPorDniAsc(int limite) {
		super(limite);
	}

	@Override
	public int compare(Acreditacion acreditacion1, Acreditacion acreditacion2) {
		return acreditacion1.getDni() - (acreditacion2.getDni());
	}

	@Override
	public int compareByKey(Integer dni, Acreditacion acreditacion) {
		return dni - acreditacion.getDni();
	}

}
