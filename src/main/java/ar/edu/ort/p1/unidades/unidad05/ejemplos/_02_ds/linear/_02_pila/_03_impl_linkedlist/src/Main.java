package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._02_pila._03_impl_linkedlist.src;

/**
 * Mediante la resolucion de este ejercicio se pretende que el alumno aprenda a
 * implementar una pila utilizando listas enlazadas como estructura de datos.
 * 
 * Implementa una pila utilizando una lista enlazada como estructura de datos.
 * 
 * La pila debe permitir almacenar cualquier tipo de objeto, e implementar al
 * menos metodos para:
 * 
 * 1. Insertar un objeto en la pila (push).
 * 
 * 2. Recuperar un objeto de la pila (pop).
 * 
 * 3. Obtener el objeto de la cima (top) de la pila, sin extraerlo.
 * 
 * 4. Averiguar si hay algun objeto almacenado en la pila.
 * 
 * 5. Devolver el numero de objetos almacenados en la pila.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String args[]) {

		PilaLinkedList<String> pilaDeStrings = new PilaLinkedList<String>();

		pilaDeStrings.mostrarTitulo();

		System.out.println("Paso 1: Agrego Queen");
		pilaDeStrings.push("Queen");
		System.out.println();

		System.out.println("Paso 2: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

		System.out.println("Paso 3: Agrego Rush");
		pilaDeStrings.push("Rush");
		System.out.println();

		System.out.println("Paso 4: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

		System.out.println("Paso 5: Agrego Van Halen");
		pilaDeStrings.push("Van Halen");
		System.out.println();

		System.out.println("Paso 6: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

		System.out.println("Paso 7: Veo el elemento que esta primero en la pila");
		System.out.println(pilaDeStrings.peek());
		System.out.println();

		System.out.println("Paso 8: Saco un elemento de la pila");
		System.out.println(pilaDeStrings.pop());
		System.out.println();

		System.out.println("Paso 9: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

		System.out.println("Paso 10: Veo el elemento que esta primero en la pila");
		System.out.println(pilaDeStrings.peek());
		System.out.println();

		System.out.println("Paso 11: Saco un elemento de la pila");
		System.out.println(pilaDeStrings.pop());
		System.out.println();

		System.out.println("Paso 12: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

		System.out.println("Paso 13: Saco un elemento de la pila");
		System.out.println(pilaDeStrings.pop());
		System.out.println();

		System.out.println("Paso 14: Muestro lo que tiene la pila");
		pilaDeStrings.mostrar();
		System.out.println();

	}

}