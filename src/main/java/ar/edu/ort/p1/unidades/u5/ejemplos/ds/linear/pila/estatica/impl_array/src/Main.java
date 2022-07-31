package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.estatica.impl_array.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {

	public static void main(String args[]) {

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