package ar.edu.ort.p1.unidades.unidad01.ejemplos._03_static._01_ejemplo_inicial.src;

public class Automovil {

	private String marca;
	private String patente;
	private String color;
	private double precio;
	private static double descuento;

	/*----------------------------------------------------------------------------*/
	/**
	 * 
	 */
	public Automovil() {

	}

	/**
	 * 
	 * @param marca
	 * @param patente
	 * @param color
	 * @param precio
	 */
	public Automovil(String marca, String patente, String color, double precio) {
		this.marca = marca;
		this.patente = patente;
		this.color = color;
		this.precio = precio;
		Automovil.descuento = 10; // De esta manera se referencia a una variable de clase
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Desde un metodo de instancia, puedo trabajar con una variable de clase. Lo
	 * contrario no puede hacerse.
	 * 
	 * @return
	 */
	public double getPrecioPromocional() {
		return this.precio - (this.precio * Automovil.descuento / 100);
	}

	/**
	 * 
	 */
	public static void anularDescuento() {
		Automovil.descuento = 0;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", patente=" + patente + ", color=" + color + ", precio=" + precio + "]";
	}

}
