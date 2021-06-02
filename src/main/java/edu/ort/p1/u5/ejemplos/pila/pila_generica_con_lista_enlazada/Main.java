/*
 * Mediante la resoluci�n de este ejercicio se pretende que el alumno aprenda a implementar
 * una pila utilizando listas enlazadas como estructura de datos.
 * Implementa una pila utilizando una lista enlazada como estructura de datos.
 * La pila debe permitir almacenar cualquier tipo de objeto, e implementar al menos m�todos para:
 * 1. Insertar un objeto en la pila (push).
 * 2. Recuperar un objeto de la pila (pop).
 * 3. Obtener el objeto de la cima (top) de la pila, sin extraerlo.
 * 4. Averiguar si hay alg�n objeto almacenado en la pila.
 * 5. Devolver el n�mero de objetos almacenados en la pila.
 * Dise�a la clase, decidiendo el nombre de cada m�todo, sus par�metros y su valor de retorno.
 * (Pista: Crea una clase Node, que sea la encargada de almacenar los valores de la pila)
 * 
*/

package edu.ort.p1.u5.ejemplos.pila.pila_generica_con_lista_enlazada;

public class Main {

	public static void main(String args[]) {

		LinkedStack<String> ls = new LinkedStack<String>();

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