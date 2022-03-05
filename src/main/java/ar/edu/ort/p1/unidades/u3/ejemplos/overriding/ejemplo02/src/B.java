package ar.edu.ort.p1.unidades.u3.ejemplos.overriding.ejemplo02.src;

public class B extends A {

	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// mostrar k - esto oculta el metodo mostrar() en A
	void mostrar() {
		super.mostrar();
		System.out.println("k: " + k);
	}
}