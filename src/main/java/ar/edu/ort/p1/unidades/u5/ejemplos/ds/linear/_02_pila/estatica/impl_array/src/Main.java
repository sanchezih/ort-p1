package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._02_pila.estatica.impl_array.src;

public class Main {

	public static void main(String args[]) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                        PILA IMPLEMENTADA CON UN ARRAY                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		PilaArray<Persona> pila = new PilaArray<>(Persona.class, 2);

		pila.push(new Persona("Maira", 39));
		System.out.println(pila.peek());

		pila.push(new Persona("Felipe", 34));
		pila.pop();

		System.out.println(pila.peek());
		pila.push(new Persona("Julia", 34));
		System.out.println(pila.peek());
		pila.pop();
		System.out.println(pila.peek());

	}
}