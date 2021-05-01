package edu.ort.overriding.p3.src;

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

	// sobrecarga de mostrar()
	void mostrar(String msg) {
		System.out.println(msg + k);
	}
}

/*--------------------------------------------------------------------------*/
class Override3 {
	public static void main(String[] args) {
		B b = new B(1, 2, 3);
		b.mostrar("Esto es k: "); // Esto llama a mostrar() en B
		b.mostrar(); // Esto llama a mostrar() en A
	}
}

/*
 * La versión mostrar() en B toma un parámetro de cadena (String). Esto hace que
 * su firma sea diferente de la de A, que no toma parámetros. Por lo tanto, no
 * se produce overriding (ocultación de nombre).
 */
