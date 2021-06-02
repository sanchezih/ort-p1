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

package edu.ort.p1.u5.ejemplos.pila.pila_generica_con_lista_enlazada;

public class TestPilaGenericaListaEnlazada {

	public static void main(String args[]) {

		PilaGenericaListaEnlazada<String> ls = new PilaGenericaListaEnlazada<String>();

		ls.push("hola");
		ls.push("como");
		ls.push("estas");

		System.out.println(ls.size());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());

	}

}