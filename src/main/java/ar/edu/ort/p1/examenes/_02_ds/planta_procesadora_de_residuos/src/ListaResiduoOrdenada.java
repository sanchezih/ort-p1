package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaResiduoOrdenada extends ListaOrdenadaNodos<Double, Residuo> {

	@Override
	public int compare(Residuo r1, Residuo r2) {
		return compareByKey(r1.calcularToxicidad(), r2);
	}

	@Override
	public int compareByKey(Double toxicidad, Residuo residuo) {
		double diferencia = residuo.calcularToxicidad() - toxicidad;
		int resultado = 0;
		double CERO = 0.0;

		if (diferencia != CERO && diferencia > CERO) {
			resultado = 1;
		} else {
			if (diferencia != CERO && diferencia < CERO) {
				resultado = -1;
			}
		}
		return resultado;
	}

}
