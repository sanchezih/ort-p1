package ar.edu.ort.p1.u2.ejemplos._06_operador_instanceof.ejemplo02.src;

class Perro extends Animal {

	public static void downCast(Animal a) {
		if (a instanceof Perro) {
			((Perro) a).ladrar();
		}
	}

	public void ladrar() {
		System.out.println("Guau guau guau...");
	}
}