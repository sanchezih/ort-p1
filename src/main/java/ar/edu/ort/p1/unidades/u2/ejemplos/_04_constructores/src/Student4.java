package ar.edu.ort.p1.unidades.u2.ejemplos._04_constructores.src;

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

//Java Program to demonstrate the use of the parameterized constructor.  
class Student4 {
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

	public static void main(String args[]) {
		// creating objects and passing values
		Student4 s1 = new Student4(111, "Karan");
		Student4 s2 = new Student4(222, "Aryan");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}