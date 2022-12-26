package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_ejemplos_iniciales._04_sorteador_generico;

public class Main {

	public static void main(String[] args) {

		System.out.println("-> Utilizo el sorteador generico para sortear objetos de tipo String");

		SorteadorGenerico<String> sorteadorDeStrings = new SorteadorGenerico<String>();

		sorteadorDeStrings.isVacio();

		System.out.println("Agrego elementos...");
		sorteadorDeStrings.add("Perro");
		sorteadorDeStrings.add("Lechuza");
		sorteadorDeStrings.add("Caballo");
		sorteadorDeStrings.add("Gato");

		sorteadorDeStrings.isVacio();

		while (!sorteadorDeStrings.isEmpty()) {
			System.out.println("Muesto elemento: " + sorteadorDeStrings.remove()); // toUpperCase() no podria ser sin
																					// castear a String
		}

		sorteadorDeStrings.isVacio();

		/*----------------------------------------------------------------------------*/

		System.out.println("\n-> Utilizo el sorteador generico para sortear objetos de tipo Integer");

		SorteadorGenerico<Integer> sorteadorDeIntegers = new SorteadorGenerico<Integer>();

		sorteadorDeIntegers.isVacio();

		System.out.println("Agrego elementos...");
		sorteadorDeIntegers.add(104);
		sorteadorDeIntegers.add(933);
		sorteadorDeIntegers.add(061);
		sorteadorDeIntegers.add(822);

		sorteadorDeIntegers.isVacio();
		while (!sorteadorDeIntegers.isEmpty()) {
			System.out.println("Muesto elemento: " + sorteadorDeIntegers.remove()); // toUpperCase() no podria ser sin
																					// castear a String
		}

		sorteadorDeIntegers.isVacio();
	}

}
