package overriding.src.p2;

class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	// Mostrar i, j
	void mostrar() {
		System.out.println("i, j: " + i + ", " + j);
	}
}
/*--------------------------------------------------------------------------*/

class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// mostrar k - esto oculta el método mostrar() en A
	void mostrar() {
		super.mostrar();
		System.out.println("k: " + k);
	}
}

/*--------------------------------------------------------------------------*/
class Override2 {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.mostrar(); // Esto llama a mostrar() en B
	}
}

/*
 * En esta versión de B, se invoca la versión de superclase de mostrar() dentro
 * de la versión de la subclase. Esto permite que se muestren todas las
 * variables de instancia.
 * 
 * Aquí, super.mostrar() llama a la versión superclase de mostrar(). La
 * anulación del método ocurre solo cuando las firmas de los dos métodos son
 * idénticas. Si no lo son, entonces los dos métodos están simplemente
 * sobrecargados.
 */
