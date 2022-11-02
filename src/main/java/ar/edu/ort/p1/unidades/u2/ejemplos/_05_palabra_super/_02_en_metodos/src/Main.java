package ar.edu.ort.p1.unidades.u2.ejemplos._05_palabra_super._02_en_metodos.src;

class Persona {
	void message() {
		System.out.println("Esta es una clase persona");
	}
}

/*----------------------------------------------------------------------------*/

class Estudiante extends Persona {

	void message() {
		System.out.println("Esta es una clase estudiante");
	}

	/* display() solo esta en la clase Estudiante */
	void display() {

		message(); // llamara al metodo message() de la clase actual

		super.message(); // llamara al metodo message() de la clase padre
	}
}

/*--------------------------------------------------------------------------*/

class Main {
	public static void main(String args[]) {

		Estudiante s = new Estudiante();
		s.display(); // llamando a display() de Estudiante

	}
}

/**
 * Si solo llamamos al metodo message(), entonces se invoca el message() de la
 * clase actual, pero con el uso de la palabra clave super, tambien se puede
 * invocar a message() de la superclase.
 */
