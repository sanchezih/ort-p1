package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_que_es_y_motivacion;

public class MiArrayList {

	/* Array de Object */
	private Object[] datosElemento;
	private int i = 0;

	/* Constructor */
	public MiArrayList(int z) {
		datosElemento = new Object[z];
	}

	/* Devuelve un elemento del array */
	public Object get(int i) {
		return datosElemento[i];
	}

	public void add(Object o) {
		datosElemento[i] = o;
		i++;
	}
}
