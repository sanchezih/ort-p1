package ar.edu.ort.p1.unidades.u2.ejemplos._05_palabra_super._03_en_constructores;

class Persona {
	Persona() {
		System.out.println("Soy el constructor de la clase Persona");
	}
}

/*----------------------------------------------------------------------------*/

class Estudiante extends Persona {
	Estudiante() {
		super(); // invoca al constructor de la clase padre
		System.out.println("Soy el constructor de la clase Estudiante");
	}
}

/*----------------------------------------------------------------------------*/

class Main {
	public static void main(String[] args) {
		Estudiante s = new Estudiante();
	}
}

/**
 * En el ejemplo hemos llamado al constructor de la superclase usando la palabra
 * clave 'super' a traves del constructor de la subclase.
 */