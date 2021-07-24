package ar.edu.ort.p1.u2.ejemplos._05_palabra_super._01_super_en_variables.src;

// clase base vehicle 
class Vehicle {
	int maxSpeed = 120;
}

/*--------------------------------------------------------------------------*/
// subclase Car extendiendo de vehicle 
class Car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		// imprime maxSpeed de la clase base (vehicle)
		System.out.println("Velocidad maxima: " + super.maxSpeed);
	}
}

/*--------------------------------------------------------------------------*/
class Main {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}

/*
 * Tanto la clase base como la subclase tienen un miembro maxSpeed. Podemos
 * acceder a maxSpeed de la clase base en la sublcase usando la palabra clave
 * super
 */
