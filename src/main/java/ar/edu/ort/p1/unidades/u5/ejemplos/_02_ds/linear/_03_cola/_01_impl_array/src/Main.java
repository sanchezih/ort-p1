package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._03_cola._01_impl_array.src;

import ar.edu.ort.p1.util.UtilCola;

/**
 * https://www.geeksforgeeks.org/array-implementation-of-queue-simple
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                        COLA IMPLEMENTADA CON UN ARRAY                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		System.out.println("COLA CON LIMITE");
		ColaArray<Integer> colaConLimite = new ColaArray<>(Integer.class, 4);

		System.out.println("Paso 1: Agrego el numero 2");
		colaConLimite.add(2);
		System.out.println();

		System.out.println("Paso 2: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		System.out.println("Paso 3: Agrego el numero 15");
		colaConLimite.add(15);
		System.out.println();

		System.out.println("Paso 4: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		System.out.println("Paso 5: Agrego el numero 26");
		colaConLimite.add(26);
		System.out.println();

		System.out.println("Paso 6: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		System.out.println("Paso 7: Veo el elemento que esta primero en la cola");
		System.out.println(colaConLimite.get());
		System.out.println();

		System.out.println("Paso 8: Saco un elemento de la cola");
		System.out.println(colaConLimite.remove());
		System.out.println();

		System.out.println("Paso 9: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		System.out.println("Paso 10: Veo el elemento que esta primero en la cola");
		System.out.println(colaConLimite.get());
		System.out.println();

		System.out.println("Paso 11: Saco un elemento de la cola");
		System.out.println(colaConLimite.remove());
		System.out.println();

		System.out.println("Paso 12: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		System.out.println("Paso 13: Saco un elemento de la cola");
		System.out.println(colaConLimite.remove());
		System.out.println();

		System.out.println("Paso 14: Muestro lo que tiene la cola");
		UtilCola.mostrar(colaConLimite);
		System.out.println();

		/*----------------------------------------------------------------------------*/

		System.out.println("COLA SIN LIMITE");
		ColaArray<String> colaSinLimite = new ColaArray<>(String.class);
		colaSinLimite.add("Primero");
		colaSinLimite.add("Segundo");
		colaSinLimite.add("Tercero");
		colaSinLimite.add("Cuarto");
		colaSinLimite.add("Quinto");
		colaSinLimite.add("Sexto");
		colaSinLimite.add("Septimo");
		colaSinLimite.add("Octavo");
		System.out.println(colaSinLimite.get());
		colaSinLimite.remove();
		colaSinLimite.remove();
		colaSinLimite.remove();
		colaSinLimite.remove();
		System.out.println(colaSinLimite.get());

		colaSinLimite.add("Noveno");
	}
}