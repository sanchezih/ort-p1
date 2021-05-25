package edu.ort.u5.ejemplos.generics._03_metodos_genericos;

public class MisMatrices {

	// Metodo estatico
	public static <T> String getElementos(T[] a) {
		return "El array tiene " + a.length + " elementos";
	}

	public static <T extends Comparable> T getElementoMenor(T[] a) {
		T res = null;

		if (a != null && a.length != 0) {
			T elementoMenor = a[0];
			for (int i = 1; i < a.length; i++) {
				if (elementoMenor.compareTo(a[i]) > 0) {
					elementoMenor = a[i];
				}
			}
			res = elementoMenor;
		}

		return res;
	}

}
