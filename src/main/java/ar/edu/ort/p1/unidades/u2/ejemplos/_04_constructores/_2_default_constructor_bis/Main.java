package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores._2_default_constructor_bis;

/**
 * Q) What is the purpose of a default constructor?
 * 
 * The default constructor is used to provide the default values to the object
 * like 0, null, etc., depending on the type.
 * 
 * 
 * Explanation:In the above class,you are not creating any constructor so
 * compiler provides you a default constructor. Here 0 and null values are
 * provided by default constructor.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String args[]) {
		// creating objects
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		// displaying values of the object
		s1.display();
		s2.display();
	}

}
