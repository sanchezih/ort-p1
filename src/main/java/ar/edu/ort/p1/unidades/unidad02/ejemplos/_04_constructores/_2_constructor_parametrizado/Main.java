package ar.edu.ort.p1.unidades.unidad02.ejemplos._04_constructores._2_constructor_parametrizado;

/**
 * A constructor which has a specific number of parameters is called a
 * parameterized constructor.
 * 
 * Why use the parameterized constructor? The parameterized constructor is used
 * to provide different values to distinct objects. However, you can provide the
 * same values also.
 * 
 * Example of parameterized constructor In this example, we have created the
 * constructor of Student class that have two parameters. We can have any number
 * of parameters in the constructor.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String args[]) {

		// creating objects and passing values
		Estudiante estudiante1 = new Estudiante(111, "Maria");
		Estudiante estudiante2 = new Estudiante(222, "Tomas");

		// calling method to display the values of object
		estudiante1.mostrar();
		estudiante2.mostrar();
	}

}
