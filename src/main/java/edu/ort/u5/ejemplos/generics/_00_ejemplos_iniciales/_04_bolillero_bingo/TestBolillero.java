package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._04_bolillero_bingo;

public class TestBolillero {

	public static void main(String[] args) {

		Bolillero<String> bolillero = new Bolillero<String>(3);

		System.out.println("El bolillero esta vacio? " + bolillero.isEmpty());

		bolillero.add("Perro");
		bolillero.add("Lechuza");
		bolillero.add("Caballo");
		bolillero.add("Gato");

		System.out.println("El bolillero esta vacio? " + bolillero.isEmpty());

		while (!bolillero.isEmpty()) {
			System.out.println(bolillero.remove());
		}

		System.out.println("El bolillero esta vacio? " + bolillero.isEmpty());
	}

}
