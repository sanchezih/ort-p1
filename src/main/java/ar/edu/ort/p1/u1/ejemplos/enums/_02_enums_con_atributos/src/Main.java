package ar.edu.ort.p1.u1.ejemplos.enums._02_enums_con_atributos.src;

public class Main {
	
	public static void main(String[] args) {
		Continente[] continentes = Continente.values();
		for (int i = 0; i < continentes.length; i++) {
			System.out.println(continentes[i].densidadPoblacion());
		}
	}
}