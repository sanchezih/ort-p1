package ar.edu.ort.p1.u2.palabraSuper._2_SuperEnMetodos;

// Clase Base Person 
class Person {
	void message() {
		System.out.println("Esta es una clase persona");
	}
}

/*--------------------------------------------------------------------------*/
// Subclase Student 
class Student extends Person {
	void message() {
		System.out.println("Esta es una clase estudiante");
	}

	// display() solo est� en la clase Student
	void display() {
		// llamar� al m�todo message() de la clase actual
		message();

		// llamar� al m�todo message() de la clase padre
		super.message();
	}
}

/*--------------------------------------------------------------------------*/
class Test {
	public static void main(String args[]) {
		Student s = new Student();

		// llamando a display() de Student
		s.display();
	}
}

/*
 * Si solo llamamos al m�todo message(), entonces se invoca el message() de la
 * clase actual, pero con el uso de la palabra clave super, tambi�n se puede
 * invocar a message() de la superclase.
 */
