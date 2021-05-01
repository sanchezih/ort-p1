package edu.ort.modificadoresDeAcceso.src._4_public.ok.ejemplo2.package_externo;

import edu.ort.modificadoresDeAcceso.src._4_public.ok.ejemplo2.package_interno.Ejemplo4;

public class ClaseExterna {
	public static void main(String[] args) {
		System.out.println(Ejemplo4.atributo1);
		// Tuvimos Acceso directo por ser publico

		Ejemplo4.metodo1(); // Metodo1 también es publico
	}
}