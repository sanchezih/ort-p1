package edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._01_sorteador_strings.src;

public class TestSorteadorDeStrings {

	public static void main(String[] args) {
		SorteadorDeStrings ss = new SorteadorDeStrings();
		
		System.out.println("El sorteador de Strings esta vacio? "+ss.isEmpty());
		
		ss.add("Perro");
		ss.add("Lechuza");
		ss.add("Caballo");
		ss.add("Gato");
		
		System.out.println("El sorteador de Strings esta vacio? "+ss.isEmpty());
		
		while(!ss.isEmpty()) {
			System.out.println(ss.remove().toUpperCase());
		}
		
		System.out.println("El sorteador de Strings esta vacio? "+ss.isEmpty());
	}

}
