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
	 * @param id
	 * @param nombre
	 */
	public Estudiante(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * Method to display the values
	 */
	void mostrar() {
		System.out.println(id + " " + nombre);
	}
}
