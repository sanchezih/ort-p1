package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._02_pila._02_impl_arraylist.src;

public class Main {

	public static void main(String[] args) {

		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                      PILA IMPLEMENTADA CON UN ARRAYLIST                      |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println();

		PilaArrayList<Integer> pilaDeEnteros = new PilaArrayList<Integer>(3);

		pilaDeEnteros.push(10);
		pilaDeEnteros.push(20);
		pilaDeEnteros.push(30);
		System.out.println("pilaDeEnteros despues de pushear 3 elementos:\n" + pilaDeEnteros);

		pilaDeEnteros.pop();
		System.out.println("pilaDeEnteros despues del pop:\n" + pilaDeEnteros);

		/*----------------------------------------------------------------------------*/

		PilaArrayList<String> pilaDeStrings = new PilaArrayList<String>(3);

		pilaDeStrings.push("hello");
		pilaDeStrings.push("world");
		pilaDeStrings.push("java");
		System.out.println("\npilaDeStrings despues de pushear 3 elementos:\n" + pilaDeStrings);

		pilaDeStrings.push("Geek for geeks");
		System.out.println("pilaDeStrings despues de pushear el 4to elemento:");

		/*----------------------------------------------------------------------------*/

		PilaArrayList<Float> pilaDeFloats = new PilaArrayList<Float>(2);

		pilaDeFloats.push(100.0f);
		pilaDeFloats.push(200.0f);
		System.out.println("\npilaDeFloats despues de pushear 2 elementos:\n" + pilaDeFloats);

		System.out.println("Hago peek de pilaDeFloats: " + pilaDeFloats.peek());
		System.out.println("Vuelvo a hacer peek de pilaDeFloats: " + pilaDeFloats.peek());

		System.out.println("Muestro pilaDeFloats:\n" + pilaDeFloats);

	}
}