package ar.edu.ort.p1.unidades.u3.ejemplos._02_overriding.ejemplo03.src;

public class B extends A {

	int k;

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	/**
	 * Sobrecarga de mostrar()
	 * 
	 * @param msg
	 */
	void mostrar(String msg) {
		System.out.println(msg + k);
	}
}
