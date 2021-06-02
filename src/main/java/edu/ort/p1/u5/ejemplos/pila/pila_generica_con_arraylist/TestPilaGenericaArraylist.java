package edu.ort.p1.u5.ejemplos.pila.pila_generica_con_arraylist;

public class TestPilaGenericaArraylist {

	public static void main(String[] args) {

		PilaGenericaArraylist<Integer> pilaDeEnteros = new PilaGenericaArraylist<>(3);

		pilaDeEnteros.push(10);
		pilaDeEnteros.push(20);
		pilaDeEnteros.push(30);

		System.out.println("pilaDeEnteros despues de pushear 10, 20 y 30 :\n" + pilaDeEnteros);

		pilaDeEnteros.pop();
		System.out.println("s1 after pop :\n" + pilaDeEnteros);

		/*----------------------------------------------------------------------------*/

		PilaGenericaArraylist<String> pilaDeStrings = new PilaGenericaArraylist<>(3);

		pilaDeStrings.push("hello");
		pilaDeStrings.push("world");
		pilaDeStrings.push("java");

		System.out.println("\npilaDeStrings despues de pushear 3 elementos:\n" + pilaDeStrings);

		System.out.println("pilaDeStrings despues de pushear el 4to elemento:");
		pilaDeStrings.push("Geek for geeks");

		/*----------------------------------------------------------------------------*/

		PilaGenericaArraylist<Float> pilaDeFloats = new PilaGenericaArraylist<>(2);

		pilaDeFloats.push(100.0f);
		pilaDeFloats.push(200.0f);
		System.out.println("\ns3 after pushing 2 elements :\n" + pilaDeFloats);

		System.out.println("top element of s3:\n" + pilaDeFloats.top());
	}
}