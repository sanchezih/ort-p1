package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._02_sorteador_generico;

public class TestSorteador {

	public static void main(String[] args) {
		Sorteador sorteador = new Sorteador();

		System.out.println(sorteador.isEmpty());

		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");

		System.out.println(sorteador.isEmpty());

		while (!sorteador.isEmpty()) {
			System.out.println(sorteador.remove()); // toUpperCase() no podria ser sin castear a String
		}

		System.out.println(sorteador.isEmpty());
	}

}
