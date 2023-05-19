package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._02_pila._01_impl_array.src;

public class Main {

	public static void main(String args[]) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                        PILA IMPLEMENTADA CON UN ARRAY                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		PilaArray<String> pilaSinLimite = new PilaArray<>(String.class);
		
		pilaSinLimite.push("Azul");
		pilaSinLimite.push("Violeta");
		pilaSinLimite.push("Gris");
		pilaSinLimite.push("Negro");
		pilaSinLimite.push("Rojo");
		pilaSinLimite.push("Celeste");
		pilaSinLimite.push("Amarillo");

		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.peek());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());

		/*----------------------------------------------------------------------------*/

		PilaArray<String> pilaConLimite = new PilaArray<>(String.class, 3);

		pilaConLimite.push("Blanco");
		System.out.println(pilaConLimite.peek());

		pilaConLimite.push("Verde");
		System.out.println(pilaConLimite.peek());

		pilaConLimite.push("Marron");
	}
}