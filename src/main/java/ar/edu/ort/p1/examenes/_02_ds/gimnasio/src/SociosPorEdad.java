package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class SociosPorEdad extends ListaOrdenadaNodos<Integer, Socio> {

	@Override
	public int compare(Socio socio1, Socio socio2) {
		return socio2.getEdad() - socio1.getEdad();
	}

	@Override
	public int compareByKey(Integer edad, Socio socio) {
		return socio.getEdad() - edad;
	}

}
