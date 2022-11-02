package ar.edu.ort.p1.unidades.u3.ejemplos._02_overriding.ejemplo01.src;

public class B extends A {

	int k;

	// Constructor
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// mostrar k - esto oculta el m�todo mostrar() en A
	void mostrar() {
		System.out.println("k: " + k);
	}
}