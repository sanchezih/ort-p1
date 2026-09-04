package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public abstract class Item {

	private String nombre;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 * 
	 * @param nombre
	 */
	public Item(String nombre) {
		this.nombre = nombre;
	}

	/*----------------------------------------------------------------------------*/

	public abstract int obtenerPeso();

	public abstract float obtenerPrecio();

}
