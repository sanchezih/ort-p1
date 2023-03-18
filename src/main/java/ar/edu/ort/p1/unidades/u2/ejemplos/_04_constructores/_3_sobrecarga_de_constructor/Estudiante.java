package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._3_sobrecarga_de_constructor;

/**
 * Java program to overload constructors
 * 
 * @author ihsanch
 *
 */
public class Estudiante {

	int id;
	String nombre;
	int edad;

	/**
	 * Constructor con 2 argumentos
	 * 
	 * @param id
	 * @param nombre
	 */
	Estudiante(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * Constructor con 3 argumentos
	 * 
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	Estudiante(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	void mostrar() {
		System.out.println(id + " " + nombre + " " + edad);
	}
}
