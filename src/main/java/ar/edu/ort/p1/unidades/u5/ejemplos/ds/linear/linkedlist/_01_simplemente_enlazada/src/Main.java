package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

public class Main {

	static ListaSimplementeEnlazada<String> listaDeStrings = new ListaSimplementeEnlazada<String>(5);

	public static void main(String[] args) {

		listaDeStrings.mostrarTitulo();

		System.out.println("Paso 1: Agrego Verde al comienzo");
		listaDeStrings.addFirst("Verde");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 2: Agrego Violeta al comienzo");
		listaDeStrings.addFirst("Violeta");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 3: Agrego Rojo al final");
		listaDeStrings.addLast("Rojo");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 4: Agrego Blanco al final");
		listaDeStrings.addLast("Blanco");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 5: Agrego Negro al final");
		listaDeStrings.addLast("Negro");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 6: Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso 7: Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso 8: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 9: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 10: Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso 11: Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso 12: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 13: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 14: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 15: Elimino el primer elemento de la lista: " + listaDeStrings.removeFirst());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 16: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 17: Agrego Rojo al final");
		listaDeStrings.addLast("Rojo");
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 18: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.print();
		System.out.println();

		System.out.println("Paso 19: Elimino el ultimo elemento de la lista: " + listaDeStrings.removeLast());
		listaDeStrings.print();
		System.out.println();

	}

}
