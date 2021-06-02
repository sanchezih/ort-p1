package edu.ort.p1.u5.ejemplos.pila.pila_enteros_con_array;

public class Main {
	public static void main(String args[]) {
		Pila pila = new Pila();
		pila.push(10);
		pila.push(20);
		pila.push(30);
		System.out.println(pila.pop() + " popped from stack");
		System.out.println(pila);
	}
}