package ar.edu.ort.p1.unidades.u5.ejemplos.pila.pila_generica_con_arraylist;

public class PilaGenericaArraylistTest {

	public static void main(String[] args) {

		PilaGenericaArraylist<Integer> pilaDeEnteros = new PilaGenericaArraylist<>(3);

		pilaDeEnteros.push(10);
		pilaDeEnteros.push(20);
		pilaDeEnteros.push(30);
		System.out.println("pilaDeEnteros despues de pushear 3 elementos:\n" + pilaDeEnteros);

		pilaDeEnteros.pop();
		System.out.println("pilaDeEnteros despues del pop:\n" + pilaDeEnteros);

		/*----------------------------------------------------------------------------*/

		PilaGenericaArraylist<String> pilaDeStrings = new PilaGenericaArraylist<>(3);

		pilaDeStrings.push("hello");
		pilaDeStrings.push("world");
		pilaDeStrings.push("java");
		System.out.println("\npilaDeStrings despues de pushear 3 elementos:\n" + pilaDeStrings);

		pilaDeStrings.push("Geek for geeks");
		System.out.println("pilaDeStrings despues de pushear el 4to elemento:");

		/*----------------------------------------------------------------------------*/

		PilaGenericaArraylist<Float> pilaDeFloats = new PilaGenericaArraylist<>(2);

		pilaDeFloats.push(100.0f);
		pilaDeFloats.push(200.0f);
		System.out.println("\npilaDeFloats despues de pushear 2 elementos:\n" + pilaDeFloats);

		System.out.println("Hago peek de pilaDeFloats: " + pilaDeFloats.peek());
		System.out.println("Vuelvo a hacer peek de pilaDeFloats: " + pilaDeFloats.peek());
		
		System.out.println("Muestro pilaDeFloats:\n" + pilaDeFloats);

	}
}