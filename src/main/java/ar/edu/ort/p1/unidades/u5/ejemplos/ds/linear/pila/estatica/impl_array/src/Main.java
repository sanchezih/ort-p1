package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.estatica.impl_array.src;

import ar.edu.ort.p1.util.pojo.Persona;

public class Main {

	public static void main(String args[]) {

		StackArray<Persona> s = new StackArray<>(Persona.class, 2);
		s.push(new Persona("Maira", 39));
		System.out.println(s.peek());
		s.push(new Persona("Felipe", 34));
		s.pop();
		System.out.println(s.peek());
		s.push(new Persona("Felipe", 34));
		System.out.println(s.peek());

	}
}