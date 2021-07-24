package ar.edu.ort.p1.u3.ejemplos.overriding.p2.src;

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
 * En esta versi�n de B, se invoca la versi�n de superclase de mostrar() dentro
 * de la versi�n de la subclase. Esto permite que se muestren todas las
 * variables de instancia.
 * 
 * Aqu�, super.mostrar() llama a la versi�n superclase de mostrar(). La
 * anulaci�n del m�todo ocurre solo cuando las firmas de los dos m�todos son
 * id�nticas. Si no lo son, entonces los dos m�todos est�n simplemente
 * sobrecargados.
 */
