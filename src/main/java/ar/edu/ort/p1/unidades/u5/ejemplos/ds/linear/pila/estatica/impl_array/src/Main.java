package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.estatica.impl_array.src;

public class Main {

	public static void main(String args[]) {

		Pila elementos = new Pila();
		elementos.push(10);
		elementos.push(20);
		elementos.push(30);

		System.out.println();

		System.out.println(elementos.peek());
		System.out.println(elementos.pop());
		System.out.println(elementos.peek());

	}
}