package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public class Comida extends Producto {

	private final static float COEF_COCIDA = 1.08f;

	private boolean cocida;
	private int cantIngredientes;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 * 
	 * @param nombre
	 * @param precioBase
	 * @param peso
	 * @param cocida
	 * @param cantIngredientes
	 */
	public Comida(String nombre, float precioBase, int peso, boolean cocida, int cantIngredientes) {
		super(nombre, precioBase, peso);
		this.cocida = cocida;
		this.cantIngredientes = cantIngredientes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo obtenerPrecio() de todas las clases que consideres,
	 * que debe calcular el precio del item segun lo especificado
	 */
	@Override
	public float obtenerPrecio() {

		float res = getPrecioBase() * cantIngredientes;

		return this.cocida ? res * COEF_COCIDA : res;
	}

}
