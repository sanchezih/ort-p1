package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

public class Main {

	static ListaSimplementeEnlazada<String> listaDeStrings = new ListaSimplementeEnlazada<String>();

	public static void main(String[] args) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                          LISTA SIMPLEMENTE ENLAZADA                          |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		System.out.println("Paso 1: Agrego Verde al comienzo");
		listaDeStrings.addFirst("Verde");
		System.out.println();

		mostrar();

		System.out.println("Paso : Agrego Violeta al comienzo");
		listaDeStrings.addFirst("Violeta");
		System.out.println();

		mostrar();

		System.out.println("Paso : Agrego Rojo al final");
		listaDeStrings.addLast("Rojo");
		System.out.println();

		mostrar();

		System.out.println("Paso : Agrego Blanco al final");
		listaDeStrings.addLast("Blanco");
		System.out.println();

		mostrar();

		System.out.println("Paso : Agrego Negro al final");
		listaDeStrings.addLast("Negro");
		System.out.println();

		mostrar();

		System.out.println("Paso : Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso : Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();

		System.out.println("Paso : Elimino el primer elemento de la lista");
		listaDeStrings.removeFirst();
		System.out.println();

		mostrar();

		System.out.println("Paso : Miro el primer elemento de la lista: " + listaDeStrings.getFirst());
		System.out.println();

		System.out.println("Paso : Miro el ultimo elemento de la lista: " + listaDeStrings.getLast());
		System.out.println();
		System.out.println("Paso : Elimino el primer elemento de la lista");
		listaDeStrings.removeFirst();
		System.out.println();

		mostrar();System.out.println("Paso : Elimino el primer elemento de la lista");
		listaDeStrings.removeFirst();
		System.out.println();

		mostrar();System.out.println("Paso : Elimino el primer elemento de la lista");
		listaDeStrings.removeFirst();
		System.out.println();

		mostrar();System.out.println("Paso : Elimino el primer elemento de la lista");
		listaDeStrings.removeFirst();
		System.out.println();

		mostrar();

	}

	private static void mostrar() {
		System.out.println(
				"Paso : Muestro lo que tiene la lista (" + listaDeStrings.getCantidadElementos() + " elementos)");
		System.out.println(listaDeStrings.toString());
		System.out.println();
	}

}
