package ejInstanceof.ejemplo02.src;

class Animal {
}

class Perro extends Animal {
	public static void main(String[] args) {
		Perro toby = new Perro();
		if (toby instanceof Animal)
			System.out.println("toby es un perro y también un animal");

		Animal chusa = new Perro(); /* creacion */
		downCast(chusa);
	}

	public static void downCast(Animal a) {
		if (a instanceof Perro)
			((Perro) a).ladrar();
	}

	public static void ladrar() {
		System.out.println("Guau");
	}
}