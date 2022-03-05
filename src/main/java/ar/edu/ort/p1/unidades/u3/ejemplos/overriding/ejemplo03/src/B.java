package ar.edu.ort.p1.unidades.u3.ejemplos.overriding.ejemplo03.src;

public class B extends A {

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
