package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear._03_cola.estatica.impl_array.src;

/**
 * https://www.geeksforgeeks.org/array-implementation-of-queue-simple
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		ColaArray<Integer> colaDeEnteros = new ColaArray<>(Integer.class, 4);

		colaDeEnteros.mostrarTitulo();

		System.out.println("Paso 1: Agrego el numero 2");
		colaDeEnteros.add(2);
		System.out.println();

		System.out.println("Paso 2: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

		System.out.println("Paso 3: Agrego el numero 15");
		colaDeEnteros.add(15);
		System.out.println();

		System.out.println("Paso 4: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

		System.out.println("Paso 5: Agrego el numero 26");
		colaDeEnteros.add(26);
		System.out.println();

		System.out.println("Paso 6: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

		System.out.println("Paso 7: Veo el elemento que esta primero en la cola");
		System.out.println(colaDeEnteros.get());
		System.out.println();

		System.out.println("Paso 8: Saco un elemento de la cola");
		System.out.println(colaDeEnteros.remove());
		System.out.println();

		System.out.println("Paso 9: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

		System.out.println("Paso 10: Veo el elemento que esta primero en la cola");
		System.out.println(colaDeEnteros.get());
		System.out.println();

		System.out.println("Paso 11: Saco un elemento de la cola");
		System.out.println(colaDeEnteros.remove());
		System.out.println();

		System.out.println("Paso 12: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

		System.out.println("Paso 13: Saco un elemento de la cola");
		System.out.println(colaDeEnteros.remove());
		System.out.println();

		System.out.println("Paso 14: Muestro lo que tiene la cola");
		colaDeEnteros.mostrar();
		System.out.println();

	}
}