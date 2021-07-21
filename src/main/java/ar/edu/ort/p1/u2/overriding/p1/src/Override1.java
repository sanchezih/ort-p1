package ar.edu.ort.p1.u2.overriding.p1.src;

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

	// mostrar k - esto oculta el m�todo mostrar() en A
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
 * Cuando se llama a un metodo anulado dentro de una subclase, siempre se
 * referira a la versi�n de ese m�todo definida por la subclase.
 * 
 * Cuando se invoca mostrar() en un objeto de tipo B, se utiliza la version
 * mostrar() definida en B. Es decir, la version mostrar() dentro de B anula la
 * versi�n declarada en A. Si desea acceder a la versi�n de la superclase de un
 * m�todo �anulado�, puede hacerlo utilizando super.
 */
