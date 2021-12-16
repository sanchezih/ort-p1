package ar.edu.ort.p1.unidades.u5.ejemplos.pila.pila_enteros_con_array;

public class TestPilaEnterosArray {
	public static void main(String args[]) {

		PilaEnterosArray pilaDeEnteros = new PilaEnterosArray();
		pilaDeEnteros.push(10);
		pilaDeEnteros.push(20);
		pilaDeEnteros.push(30);

		System.out.println(pilaDeEnteros.peek());
		System.out.println(pilaDeEnteros.pop());
		System.out.println(pilaDeEnteros.peek());

	}
}