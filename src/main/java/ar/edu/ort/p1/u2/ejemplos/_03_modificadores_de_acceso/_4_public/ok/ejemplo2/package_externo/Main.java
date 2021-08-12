package ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._4_public.ok.ejemplo2.package_externo;

import ar.edu.ort.p1.u2.ejemplos._03_modificadores_de_acceso._4_public.ok.ejemplo2.package_interno.Ejemplo4;

public class Main {

	public static void main(String[] args) {
		System.out.println(Ejemplo4.atributo1);
		// Tuvimos Acceso directo por ser publico

		Ejemplo4.metodo1(); // Metodo1 tambien es publico
	}
}