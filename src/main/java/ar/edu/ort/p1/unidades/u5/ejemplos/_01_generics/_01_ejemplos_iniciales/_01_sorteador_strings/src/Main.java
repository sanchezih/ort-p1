package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._01_ejemplos_iniciales._01_sorteador_strings.src;

public class Main {

	public static void main(String[] args) {

		SorteadorDeStrings sorteador = new SorteadorDeStrings();

		System.out.println("El sorteador de Strings esta vacio? -> " + sorteador.isEmpty());

		System.out.println();
		System.out.println("Agrego 4 Strings...");
		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");

		System.out.println();
		System.out.println("El sorteador de Strings esta vacio? -> " + sorteador.isEmpty());

		System.out.println();
		System.out.println("Comienzo a vaciar el sorteador...");
		while (!sorteador.isEmpty()) {
			System.out.println("\t-> " + sorteador.remove().toUpperCase());
		}

		System.out.println();
		System.out.println("El sorteador de Strings esta vacio? -> " + sorteador.isEmpty());
	}

}
