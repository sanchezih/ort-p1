package ar.edu.ort.p1.unidades.u3.ejemplos._02_overriding.ejemplo01.src;

public class A {

	int i;
	int j;

	// Constructor
	A(int a, int b) {
		i = a;
		j = b;
	}

	// Mostrar i, j
	void mostrar() {
		System.out.println("i, j: " + i + ", " + j);
	}
}