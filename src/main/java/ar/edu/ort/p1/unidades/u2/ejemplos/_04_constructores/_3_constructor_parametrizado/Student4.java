package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._3_constructor_parametrizado;

/**
 * Java Program to demonstrate the use of the parameterized constructor.
 * 
 * @author ihsanch
 *
 */
public class Student4 {

	int id;
	String name;

	// creating a parameterized constructor
	Student4(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}
}
