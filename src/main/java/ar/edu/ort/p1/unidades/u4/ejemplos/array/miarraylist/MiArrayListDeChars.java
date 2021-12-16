package ar.edu.ort.p1.unidades.u4.ejemplos.array.miarraylist;

public class MiArrayListDeChars {
	private char[] elementos = { 'A', 'P', 'R', 'E', 'N', 'D', 'E' };

	public void add(char elemento) {
		int longitud;
		char[] vecNuevo;

		longitud = this.elementos.length;
		vecNuevo = new char[longitud + 1];

		for (int i = 0; i <= longitud - 1; i++) {
			vecNuevo[i] = this.elementos[i];
		}
		vecNuevo[longitud] = elemento;
		this.elementos = vecNuevo;
	}
}

// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html