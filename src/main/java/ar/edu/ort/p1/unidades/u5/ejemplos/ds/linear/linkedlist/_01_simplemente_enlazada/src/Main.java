package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._01_simplemente_enlazada.src;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList<Integer> listaDeEnteros = new SinglyLinkedList<Integer>();

		System.out.println("listaDeEnteros...");

		
		listaDeEnteros.addFirst(100);
	//	listaDeEnteros.addFirst(200);
		listaDeEnteros.addLast(300);
		System.out.println(listaDeEnteros);

		listaDeEnteros.removeFirst();

		System.out.println(listaDeEnteros);
		
		SinglyLinkedList<String> listaDeStrings = new SinglyLinkedList<String>();


	}

}
