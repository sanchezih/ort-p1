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
		Estudiante e1 = new Estudiante();
		Estudiante e2 = new Estudiante();
	
		// displaying values of the object
		e1.mostrar();
		e2.mostrar();
	}

}
