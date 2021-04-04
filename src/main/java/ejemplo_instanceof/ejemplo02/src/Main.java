package ejemplo_instanceof.ejemplo02.src;

class Animal {
}

class Main extends Animal {
	public static void main(String[] args) {
		Main toby = new Main();
		if (toby instanceof Animal)
			System.out.println("toby es un perro y también un animal");

		Animal chusa = new Main(); /* creacion */
		downCast(chusa);
	}

	public static void downCast(Animal a) {
		if (a instanceof Main)
			((Main) a).ladrar();
	}

	public static void ladrar() {
		System.out.println("Guau");
	}
}