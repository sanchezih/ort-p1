package ar.edu.ort.p1.u2.ejemplos._06_operador_instanceof.ejemplo04.src;
//Java program to check if an object of a class is also an instance of the interface implemented by the class

interface Animal {
}

class Perro implements Animal {
}

class Main {
	public static void main(String[] args) {

		Perro perro = new Perro(); // Instancio la clase Perro

		/* checks if the object of Dog is also an instance of Animal */
		System.out.println(perro instanceof Animal); // returns true
	}
}