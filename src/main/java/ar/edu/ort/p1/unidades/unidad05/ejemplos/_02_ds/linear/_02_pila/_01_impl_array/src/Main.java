package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._02_pila._01_impl_array.src;

public class Main {

	public static void main(String args[]) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                        PILA IMPLEMENTADA CON UN ARRAY                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		System.out.println("PILA SIN LIMITE");
		PilaArray<String> pilaSinLimite = new PilaArray<>(String.class);

		System.out.println("Le inserto elementos...");
		pilaSinLimite.push("Azul");
		pilaSinLimite.push("Violeta");
		pilaSinLimite.push("Gris");
		pilaSinLimite.push("Negro");
		pilaSinLimite.push("Rojo");
		pilaSinLimite.push("Celeste");
		pilaSinLimite.push("Amarillo");
		pilaSinLimite.push("Blanco");

		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.peek());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());
		System.out.println(pilaSinLimite.pop());

		System.out.println();

		/*----------------------------------------------------------------------------*/

		System.out.println("PILA CON LIMITE");
		PilaArray<String> pilaConLimite = new PilaArray<>(String.class, 3);

		pilaConLimite.push("Magenta");
		System.out.println(pilaConLimite.peek());

		pilaConLimite.push("Verde");
		System.out.println(pilaConLimite.peek());

		pilaConLimite.push("Marron");
	}
}