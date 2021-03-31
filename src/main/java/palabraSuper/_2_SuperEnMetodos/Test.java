package palabraSuper._2_SuperEnMetodos;

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

	// display() solo está en la clase Student
	void display() {
		// llamará al método message() de la clase actual
		message();

		// llamará al método message() de la clase padre
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
 * Si solo llamamos al método message(), entonces se invoca el message() de la
 * clase actual, pero con el uso de la palabra clave super, también se puede
 * invocar a message() de la superclase.
 */
