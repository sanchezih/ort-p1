package ar.edu.ort.p1.u2.ejemplos._06_operador_instanceof.src;

class Perro extends Animal {

	public static void downCast(Animal animal) {
		if (animal instanceof Perro) {
			((Perro) animal).ladrar(); // Downcasting
		}
	}

	public void ladrar() {
		System.out.println("Guau guau guau...");
	}
}