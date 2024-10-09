package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._01_ejemplos_iniciales._04_sorteador_generico;

/**
 * Programacion generica. Que es y por que utilizarla.
 * https://www.youtube.com/watch?v=MFu8a_LpnIc
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("UTILIZO EL SORTEADOR GENERICO PARA SORTEAR OBJETOS DE TIPO STRING");
		System.out.println();

		SorteadorGenerico<String> sorteadorDeStrings = new SorteadorGenerico<>();

		sorteadorDeStrings.isVacio();

		System.out.println("Agrego 4 Strings...");
		sorteadorDeStrings.add("Perro");
		sorteadorDeStrings.add("Lechuza");
		sorteadorDeStrings.add("Caballo");
		sorteadorDeStrings.add("Gato");

		sorteadorDeStrings.isVacio();

		System.out.println("Comienzo a vaciar el sorteador...");
		while (!sorteadorDeStrings.isEmpty()) {
			System.out.println("\t -> Saco un elemento: " + sorteadorDeStrings.remove());
		}

		sorteadorDeStrings.isVacio();
		System.out.println();

		/*----------------------------------------------------------------------------*/

		System.out.println("=============================================================================");
		System.out.println();

		System.out.println("UTILIZO EL SORTEADOR GENERICO PARA SORTEAR OBJETOS DE TIPO INTEGER");
		System.out.println();

		SorteadorGenerico<Integer> sorteadorDeIntegers = new SorteadorGenerico<>();

		sorteadorDeIntegers.isVacio();

		System.out.println("Agrego 4 Integers...");
		sorteadorDeIntegers.add(104);
		sorteadorDeIntegers.add(933);
		sorteadorDeIntegers.add(061);
		sorteadorDeIntegers.add(822);

		sorteadorDeIntegers.isVacio();

		System.out.println("Comienzo a vaciar el sorteador...");
		while (!sorteadorDeIntegers.isEmpty()) {
			System.out.println("\t -> Saco un elemento: " + sorteadorDeIntegers.remove());
		}

		sorteadorDeIntegers.isVacio();
	}

}
