package ar.edu.ort.p1.unidades.u5.ejemplos.generics._00_ejemplos_iniciales._02_sorteador_objects;

public class Main {

	public static void main(String[] args) {
		SorteadorDeObjects sorteador = new SorteadorDeObjects();

		System.out.println("El sorteador de Object esta vacio? " + sorteador.isEmpty());

		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");

		System.out.println("El sorteador de Object esta vacio? " + sorteador.isEmpty());

		while (!sorteador.isEmpty()) {
			System.out.println(sorteador.remove()); // toUpperCase() no podria ser sin castear a String
		}

		System.out.println("El sorteador de Object esta vacio? " + sorteador.isEmpty());
	}

}