package ar.edu.ort.p1.unidades.u5.ejemplos.generics._03_metodos_genericos;

/**
 * Los metodos genericos no tienen que estar necesariamente creados en clases
 * genericas
 * 
 * @author ihsanch
 *
 */
public class MisMatrices {

	/**
	 * Metodo estatico (de clase) que devuelve un String que nos indicara la
	 * longitud del array que reciba como parametro.
	 * 
	 * @param <T>
	 * @param array
	 * @return
	 */
	public static <T> String getElementos(T[] array) {
		return "El array " + array.getClass().getSimpleName() + " tiene " + +array.length + " elementos";
	}

	/**
	 * Metodo estatico (de clase) que devuelve el elemento menor del array que
	 * recibe como parametro. El objeto que devuelve este metodo es generico.
	 * 
	 * @param <T>
	 * @param a
	 * @return
	 */
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
