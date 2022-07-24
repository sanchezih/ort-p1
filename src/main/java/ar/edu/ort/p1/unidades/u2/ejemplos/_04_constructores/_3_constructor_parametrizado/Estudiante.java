package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._3_constructor_parametrizado;

/**
 * Java Program to demonstrate the use of the parameterized constructor.
 * 
 * @author ihsanch
 *
 */
public class Estudiante {

	int id;
	String name;

	// creating a parameterized constructor
	Estudiante(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}
}
