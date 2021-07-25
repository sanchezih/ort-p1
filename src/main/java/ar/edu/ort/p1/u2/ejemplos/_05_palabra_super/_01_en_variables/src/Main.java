package ar.edu.ort.p1.u2.ejemplos._05_palabra_super._01_en_variables.src;

class Vehiculo {
	int velocidadMaxima = 120;
}

/*----------------------------------------------------------------------------*/

class Automovil extends Vehiculo {
	int velocidadMaxima = 180;

	void display() {
		// imprime velocidadMaxima de la clase base (vehiculo)
		System.out.println("Velocidad maxima: " + super.velocidadMaxima);
	}
}

/*----------------------------------------------------------------------------*/

class Main {
	public static void main(String[] args) {
		Automovil small = new Automovil();
		small.display();
	}
}

/**
 * Tanto la clase base como la subclase tienen un miembro maxSpeed. Podemos
 * acceder a maxSpeed de la clase base en la sublcase usando la palabra clave
 * super
 */
