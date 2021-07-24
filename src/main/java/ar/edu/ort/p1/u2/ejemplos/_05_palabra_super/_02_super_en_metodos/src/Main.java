package ar.edu.ort.p1.u2.ejemplos._05_palabra_super._02_super_en_metodos.src;

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
		// llamar� al metodo message() de la clase actual
		message();

		// llamar� al metodo message() de la clase padre
		super.message();
	}
}

/*--------------------------------------------------------------------------*/

class Main {
	public static void main(String args[]) {
		Student s = new Student();

		// llamando a display() de Student
		s.display();
	}
}

/**
 * Si solo llamamos al metodo message(), entonces se invoca el message() de la
 * clase actual, pero con el uso de la palabra clave super, tambien se puede
 * invocar a message() de la superclase.
 */
