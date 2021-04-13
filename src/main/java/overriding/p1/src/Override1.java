package overriding.p1.src;

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
		System.out.println("k: " + k);
	}
}

/*--------------------------------------------------------------------------*/
class Override1 {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.mostrar(); // Esto llama a mostrar() en B
	}
}

/*
 * Cuando se llama a un método anulado dentro de una subclase, siempre se
 * referirá a la versión de ese método definida por la subclase.
 * 
 * Cuando se invoca mostrar() en un objeto de tipo B, se utiliza la versión
 * mostrar() definida en B. Es decir, la versión mostrar() dentro de B anula la
 * versión declarada en A. Si desea acceder a la versión de la superclase de un
 * método ‘anulado’, puede hacerlo utilizando super.
 */
