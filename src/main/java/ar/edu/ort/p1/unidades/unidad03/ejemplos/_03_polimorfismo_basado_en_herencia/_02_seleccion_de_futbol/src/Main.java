package ar.edu.ort.p1.unidades.unidad03.ejemplos._03_polimorfismo_basado_en_herencia._02_seleccion_de_futbol.src;

import java.util.ArrayList;

public class Main {

	public static ArrayList<IntegranteDeSeleccion> integrantes = new ArrayList<IntegranteDeSeleccion>();

	public static void main(String[] args) {

		/**
		 * El polimorfismo consiste en declarar un objeto de una clase, pero
		 * instanciarlo como un descendiente de dicha clase.
		 */

		// Hago upcasting. Ver video https://www.youtube.com/watch?v=UG3n-GZtnZk
		IntegranteDeSeleccion gallarre = new Entrenador(1, "Luis", "Gallarre", 41, 52418);
		IntegranteDeSeleccion aguirre = new Futbolista(2, "Francisco", "Aguirre", 34, 5, "Volante");
		IntegranteDeSeleccion perez = new Masajista(3, "Juan", "Perez", 47, "Licenciado en Fisioterapia", 23);

		integrantes.add(gallarre);
		integrantes.add(aguirre);
		integrantes.add(perez);

		// Concentracion
		System.out.println("1. Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.concentrarse();
		}

		// Viaje
		System.out.println("\n2. Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.viajar();
		}

		// Entrenamiento
		System.out.println("\n3. Entrenamiento: Todos los integrantes tienen su funcion en un entrenamiento");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnEntrenamiento();
		}

		// Partido de futbol
		System.out.println("\n4. Partido de Futbol: Todos los integrantes tienen su funcion en un partido");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnPartido();
		}

		/*----------------------------------------------------------------------------*/

		/**
		 * En los siguientes 3 metodos es necesario hacer downcasting. Ver video:
		 * https://www.youtube.com/watch?v=nzPC7dk_nmg
		 */
		// Planificar un entrenamiento
		System.out.println(
				"\n5. Planificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento");
		((Entrenador) gallarre).planificarEntrenamiento();

		// Entrevista
		System.out.println("\n6. Dar entrevista: Solo el futbolista tiene el metodo para dar una entrevista");
		((Futbolista) aguirre).entrevista();

		// MASAJE
		System.out.println("\n7. Masaje: Solo el masajista tiene el metodo para dar un masaje:");
		((Masajista) perez).darMasaje();

	}
}
