package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._03_sorteador_bingo;

public class TestBolillero {

	public static void main(String[] args) {
		Bolillero sorteador = new Bolillero();
		
		System.out.println(sorteador.isEmpty());
		
		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");
		
		System.out.println(sorteador.isEmpty());
		
		while(!sorteador.isEmpty()) {
			System.out.println(sorteador.remove().toUpperCase());
		}
		
		System.out.println(sorteador.isEmpty());
	}

}
