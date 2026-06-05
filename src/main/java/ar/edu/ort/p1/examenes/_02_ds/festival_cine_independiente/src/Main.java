package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

import ar.edu.ort.p1.util.UtilCola;

public class Main {

	public static void main(String[] args) {

		Festival festival = new Festival();

		System.out.println("Registarciones validadas");
		UtilCola.mostrarColaGenerica(festival.getRegistraciones());

		// Ejercicio 1
		System.out.println();
		System.out.println("Ejercicio 1 - Se generan las acreditaciones a partir de las registraciones");
		festival.procesarRegistraciones();

		// Ejercicio 2
		System.out.println();
		System.out.println("Ejercicio 2 - Acreditados por tipo de funcion y por pelicula");
		int[][] res = festival.obtenerAcreditadosPorTipoDeFuncionYPelicula();

		Pelicula[] peliculas = festival.getPeliculas();

		TipoDeFuncion[] tipos = TipoDeFuncion.values();

		// Encabezado
		System.out.print(String.format("%-20s", "Pelicula"));
		for (TipoDeFuncion tipo : tipos) {
			System.out.print(String.format("%-15s", tipo.name()));
		}
		System.out.println();
		System.out.println("-".repeat(20 + 15 * tipos.length));

		// Cuerpo
		for (int i = 0; i < res.length; i++) {
			System.out.print(String.format("%-20s", peliculas[i].getNombre()));
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(String.format("%-15d", res[i][j]));
			}
			System.out.println();
		}

		// Ejercicio 3
		System.out.println();
		System.out.println("Ejercicio 3 - A partir de un DNI, devuelve la acreditacion correspondiente si existe");
		System.out.println(peliculas[1].obtenerAcreditacion(11111111));

	}

}
