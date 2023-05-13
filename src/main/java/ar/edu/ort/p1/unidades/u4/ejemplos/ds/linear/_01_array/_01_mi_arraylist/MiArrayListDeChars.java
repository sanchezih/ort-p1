package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear._01_array._01_mi_arraylist;

import java.util.Arrays;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * 
 * @author ihsanch
 *
 */
public class MiArrayListDeChars {

	private char[] elementos = { 'A', 'P', 'R', 'E', 'N', 'D', 'E' };

	/**
	 * 
	 * @param elemento
	 */
	public void add(char elemento) {
		int longitud;
		char[] vectorNuevo;
		longitud = this.elementos.length;
		vectorNuevo = new char[longitud + 1];
		for (int i = 0; i <= longitud - 1; i++) {
			vectorNuevo[i] = this.elementos[i];
		}
		vectorNuevo[longitud] = elemento;
		this.elementos = vectorNuevo;
	}

	@Override
	public String toString() {
		return "MiArrayListDeChars [elementos=" + Arrays.toString(elementos) + "]";
	}

}