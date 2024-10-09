package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._01_linkedlist._02_doblemente_enlazada.src;

public class Main {

	public static void main(String[] args) {

		ListaDoblementeEnlazada<String> listaDeStrings = new ListaDoblementeEnlazada<String>();

		listaDeStrings.mostrarTitulo();

		System.out.println("Paso 1: Agrego Guitarra al comienzo");
		listaDeStrings.addFirst("Guitarra");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 2: Agrego Bajo al comienzo");
		listaDeStrings.addFirst("Bajo");
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 3: Agrego Bateria al comienzo");
		listaDeStrings.addFirst("Bateria");
		listaDeStrings.printForward();
		System.out.println();

		listaDeStrings.printBackward();
		System.out.println();

		System.out.println("Paso 4: Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso 5: Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso 6: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.printForward();
		System.out.println();

		System.out.println("Paso 7: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.printForward();
		System.out.println();
	}

}
