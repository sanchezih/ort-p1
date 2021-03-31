package palabraSuper._1_SuperEnVariables;

/* clase base vehicle */
class Vehicle {
	int maxSpeed = 120;
}

/* subclase Car extendiendo de vehicle */
class Car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		/* imprime maxSpeed de la clase base (vehicle) */
		System.out.println("Velocidad máxima: " + super.maxSpeed);
	}
}

/* Programa de controlador Test */
class Test {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}

/*
 * Tanto la clase base como la subclase tienen un miembro maxSpeed. Podriamos
 * acceder a maxSpeed de la clase base en la sublcase usando la palabra clave
 * super
 */
