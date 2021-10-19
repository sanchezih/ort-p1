package ar.edu.ort.p1.u5.ejemplos.generics._00_ejemplos_iniciales._01_sorteador_strings.src;

public class SorteadorDeStringsTest {

	public static void main(String[] args) {
		SorteadorDeStrings sorteador = new SorteadorDeStrings();
		
		System.out.println("El sorteador de Strings esta vacio? "+sorteador.isEmpty());
		
		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");
		
		System.out.println("El sorteador de Strings esta vacio? "+sorteador.isEmpty());
		
		while(!sorteador.isEmpty()) {
			System.out.println(sorteador.remove().toUpperCase());
		}
		
		System.out.println("El sorteador de Strings esta vacio? "+sorteador.isEmpty());
	}

}
