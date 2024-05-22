package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._01_linkedlist._01_simplemente_enlazada.src;

public class Main {

	public static void main(String[] args) {

		ListaSimplementeEnlazada<String> listaDeStrings = new ListaSimplementeEnlazada<String>(5);

		listaDeStrings.mostrarTitulo();

		System.out.println("Paso 1: Agrego Verde al comienzo");
		listaDeStrings.addFirst("Verde");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 2: Agrego Violeta al comienzo");
		listaDeStrings.addFirst("Violeta");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 3: Agrego Rojo al final");
		listaDeStrings.addLast("Rojo");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 4: Agrego Blanco al final");
		listaDeStrings.addLast("Blanco");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 5: Agrego Negro al final");
		listaDeStrings.addLast("Negro");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 6: Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso 7: Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso 8: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 9: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 10: Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso 11: Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso 12: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 13: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 14: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 15: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 16: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 17: Agrego Rojo al final");
		listaDeStrings.addLast("Rojo");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 18: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 19: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();

	}

}
