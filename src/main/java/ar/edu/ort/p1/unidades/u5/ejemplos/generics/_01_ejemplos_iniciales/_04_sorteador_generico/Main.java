package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_ejemplos_iniciales._04_sorteador_generico;

public class Main {

	public static void main(String[] args) {

		System.out.println("--> Utilizo el sorteador generico para sortear objetos de tipo String");

		SorteadorGenerico<String> sorteadorParaStrings = new SorteadorGenerico<String>();

		System.out.println("El sorteador esta vacio? " + sorteadorParaStrings.isEmpty());

		System.out.println("Agrego elementos...");
		sorteadorParaStrings.add("Perro");
		sorteadorParaStrings.add("Lechuza");
		sorteadorParaStrings.add("Caballo");
		sorteadorParaStrings.add("Gato");

		System.out.println("El sorteador esta vacio? " + sorteadorParaStrings.isEmpty());

		while (!sorteadorParaStrings.isEmpty()) {
			System.out.println("Muesto elemento: " + sorteadorParaStrings.remove()); // toUpperCase() no podria ser sin
																						// castear a String
		}

		System.out.println("El sorteador esta vacio? " + sorteadorParaStrings.isEmpty());

		/*----------------------------------------------------------------------------*/

		System.out.println("\n--> Utilizo el sorteador generico para sortear objetos de tipo Integer");

		SorteadorGenerico<Integer> sorteadorParaIntegers = new SorteadorGenerico<Integer>();

		System.out.println("El sorteador esta vacio? " + sorteadorParaIntegers.isEmpty());

		System.out.println("Agrego elementos...");
		sorteadorParaIntegers.add(104);
		sorteadorParaIntegers.add(933);
		sorteadorParaIntegers.add(061);
		sorteadorParaIntegers.add(822);

		System.out.println("El sorteador esta vacio? " + sorteadorParaIntegers.isEmpty());

		while (!sorteadorParaIntegers.isEmpty()) {
			System.out.println("Muesto elemento: " + sorteadorParaIntegers.remove()); // toUpperCase() no podria ser sin
																						// castear a String
		}

		System.out.println("El sorteador esta vacio? " + sorteadorParaIntegers.isEmpty());
	}

}
