package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.linkedlist._02_simplemente_enlazada_circular.src;

public class Main {

	public static void main(String[] args) {

		CircularlyLinkedList<Integer> listaDeEnteros = new CircularlyLinkedList<Integer>();
		listaDeEnteros.addLast(190);
		listaDeEnteros.addFirst(141);
		listaDeEnteros.addLast(2);
		listaDeEnteros.listar();
		listaDeEnteros.rotate();
//		listaDeEnteros.addLast(3);
//		listaDeEnteros.addLast(4);

		System.out.println();
		listaDeEnteros.listar();

	}

}
