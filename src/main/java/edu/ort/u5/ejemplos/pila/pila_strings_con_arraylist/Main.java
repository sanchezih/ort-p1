package edu.ort.u5.ejemplos.pila.pila_strings_con_arraylist;

public class Main {
	public static void main(String[] args) {
		
		Pila pila = new Pila();
		System.out.println("Is Stack Empty:"+pila.isEmpty());
		
		pila.push("Gyan");
		pila.push("Vivek");
		pila.push("Rochit");
		pila.push("Panda");
		
		System.out.println("Is Stack Empty:"+pila.isEmpty());
		System.out.println(pila);
		System.out.println("Stack Size:"+pila.size());
		System.out.println("Peek Top Element:"+pila.peek());
		System.out.println("After peek:"+pila);
		System.out.println("Pop Top Element:"+pila.pop());
		System.out.println("After pop:"+pila);
		System.out.println("Stack Size now:"+pila.size());
		
	}
}
