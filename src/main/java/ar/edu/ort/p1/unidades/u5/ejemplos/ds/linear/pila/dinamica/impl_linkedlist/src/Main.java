/*
 * Mediante la resolucion de este ejercicio se pretende que el alumno aprenda a implementar
 * una pila utilizando listas enlazadas como estructura de datos.
 * Implementa una pila utilizando una lista enlazada como estructura de datos.
 * La pila debe permitir almacenar cualquier tipo de objeto, e implementar al menos metodos para:
 * 1. Insertar un objeto en la pila (push).
 * 2. Recuperar un objeto de la pila (pop).
 * 3. Obtener el objeto de la cima (top) de la pila, sin extraerlo.
 * 4. Averiguar si hay algun objeto almacenado en la pila.
 * 5. Devolver el numero de objetos almacenados en la pila.
 * 
*/

package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.pila.dinamica.impl_linkedlist.src;

public class Main {

	public static void main(String args[]) {

		StackLinkedList<String> ls = new StackLinkedList<String>();

		ls.push("hola");
		ls.push("como");
		ls.push("estas");

		ls.display();

		System.out.println(ls.pop());
		System.out.println(ls.pop());
		ls.display();
		System.out.println(ls.pop());
		ls.display();

		System.out.println(ls.pop());

	}

}