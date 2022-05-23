package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_que_es_y_motivacion;

/**
 * Simulamos que no disponemos de la clase ArrayList, entonces la creamos
 * nosotros SIN UTILIZAR PROGRAMACION GENERICA
 * 
 * @author ihsanch
 *
 */
public class MiArrayList {

	// Array de Object
	private Object[] elementos;
	private int contador = 0;

	// Constructor
	public MiArrayList(int z) {
		elementos = new Object[z];
	}

	/**
	 * Devuelve un elemento del array
	 * 
	 * @param i
	 * @return
	 */
	public Object getElemento(int i) {
		return elementos[i];
	}

	public void addElemento(Object o) {
		elementos[contador] = o;
		contador++;
	}
}
