package ar.edu.ort.p1.unidades.u4.ejemplos.matrix.primerejemplo;

public class Main {

	public static void main(String args[]) {
		Matriz m1 = new Matriz(3);
		Matriz m2 = new Matriz(3);
		int[] v1 = { 3, 2, 1, 1, 2, 3, 2, 3, 1 };
		int[] v2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };
		int[] v3 = { 1, 0, 0, 0, 1, 0, 0, 0, 1 };
		m1.asignarDatos(v1);
		m2.asignarDatos(v2);
		m1.mostrar();
		m2.mostrar();
		m1.producto(m2);
		m1.mostrar();
		m1.suma(m2);
		m1.mostrar();
		m1.traspuesta();
		m1.mostrar();
	}

}
