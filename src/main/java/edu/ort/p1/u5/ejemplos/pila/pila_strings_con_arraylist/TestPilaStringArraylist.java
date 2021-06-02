package edu.ort.p1.u5.ejemplos.pila.pila_strings_con_arraylist;

public class TestPilaStringArraylist {
	public static void main(String[] args) {

		PilaStringArraylist pila = new PilaStringArraylist();
		
		System.out.println("Is Stack Empty:" + pila.isEmpty());

		pila.push("Lunes");
		pila.push("Martes");
		pila.push("Sabado");
		pila.push("Domingo");

		System.out.println("Is Stack Empty:" + pila.isEmpty());
		
		System.out.println(pila);
		System.out.println("Stack Size:" + pila.size());
		System.out.println("Peek Top Element:" + pila.peek());
		System.out.println("After peek:" + pila);
		System.out.println("Pop Top Element:" + pila.pop());
		System.out.println("After pop:" + pila);
		System.out.println("Stack Size now:" + pila.size());

	}
}
