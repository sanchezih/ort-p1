package edu.ort.u5.ejemplos.generics._00_ejemplos_iniciales._04_bolillero_bingo;

public class TestBolillero {

	public static void main(String[] args) {
		
		Bolillero<String> b = new Bolillero<String>(3);
		
		System.out.println(b.isEmpty());
		
		b.add("Perro");
		b.add("Lechuza");
		b.add("Caballo");
		b.add("Gato");
		
		System.out.println(b.isEmpty());
		
		while(!b.isEmpty()) {
			System.out.println(b.remove());
		}
		
		System.out.println(b.isEmpty());
	}

}
