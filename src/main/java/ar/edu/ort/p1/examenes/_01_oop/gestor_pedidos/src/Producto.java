package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public abstract class Producto extends Item {

	private float precioBase;
	private int peso;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 * 
	 * @param nombre
	 * @param precioBase
	 * @param peso
	 */
	public Producto(String nombre, float precioBase, int peso) {
		super(nombre);
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/*----------------------------------------------------------------------------*/

	protected float getPrecioBase() {
		return precioBase;
	}

	/**
	 * Ejercicio D: El metodo obtenerPeso() de todas las clases que consideres, que
	 * debe calcular el peso del item segun lo especificado
	 */
	@Override
	public int obtenerPeso() {
		return this.peso;
	}

}
