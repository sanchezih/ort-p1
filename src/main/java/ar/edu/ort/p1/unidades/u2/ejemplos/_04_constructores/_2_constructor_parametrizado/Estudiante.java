package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._2_constructor_parametrizado;

/**
 * Java Program to demonstrate the use of the parameterized constructor.
 * 
 * @author ihsanch
 *
 */
public class Estudiante {

	private int id;
	private String nombre;

	/**
	 * Constructor parametrizado
	 * 
	 * @param i
	 * @param n
	 */
	public Estudiante(int i, String n) {
		this.id = i;
		this.nombre = n;
	}

	/**
	 * Method to display the values
	 */
	void mostrar() {
		System.out.println(id + " " + nombre);
	}
}
