package palabraSuper._2_SuperEnMetodos;

/* Clase Base Person */
class Person {
	void message() {
		System.out.println("Esta es una clase persona");
	}
}

/* Subclase Student */
class Student extends Person {
	void message() {
		System.out.println("Esta es una clase estudiante");
	}

	// Tenga en cuenta que display() solo está en la clase Student
	void display() {
		// invocará o llamará al método message() de la clase actual
		message();

		// invocará o llamará al método message() de la clase padre
		super.message();
	}
}

/* Programa Controlador Test */
class Test {
	public static void main(String args[]) {
		Student s = new Student();

		// llamando a display() de Student
		s.display();
	}
}