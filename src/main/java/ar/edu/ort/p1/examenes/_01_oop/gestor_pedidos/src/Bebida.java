package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public class Bebida extends Producto {

	private final static int PESO_X_CM3 = 53;

	private Tamanio tamanio;

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Los metodos constructores de todos los tipos de Items que
	 * encuentres
	 * 
	 * @param nombre
	 * @param precioBase
	 * @param peso
	 * @param tamanio
	 */
	public Bebida(String nombre, float precioBase, int peso, Tamanio tamanio) {
		super(nombre, precioBase, peso);
		this.tamanio = tamanio;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo obtenerPrecio() de todas las clases que consideres,
	 * que debe calcular el precio del item segun lo especificado
	 */
	@Override
	public float obtenerPrecio() {
		return getPrecioBase() * tamanio.getCoefPrecio();
	}

	/**
	 * Ejercicio D: El metodo obtenerPeso() de todas las clases que consideres, que
	 * debe calcular el peso del item segun lo especificado
	 */
	@Override
	public int obtenerPeso() {
		return super.obtenerPeso() + PESO_X_CM3 * tamanio.getCapacidadCM3();
	}
}
