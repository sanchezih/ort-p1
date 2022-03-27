package ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src;

import java.util.ArrayList;

import ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo.Entrenador;
import ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo.Futbolista;
import ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo.IntegranteDeSeleccion;
import ar.edu.ort.p1.unidades.u3.ejemplos.polimorfismo.src.polimorfismo.Masajista;

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
		System.out.println("\n3.Entrenamiento: Todos los integrantes tienen su funcion en un entrenamiento");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnEntrenamiento();
		}

		// Partido de futbol
		System.out.println("\nPartido de Futbol: Todos los integrantes tienen su funcion en un partido");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"\nPlanificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento:");
		System.out.print(gallarre.getNombre() + " " + gallarre.getApellido() + " -> ");

		// Hago Downcasting. Ver video https://www.youtube.com/watch?v=nzPC7dk_nmg
		((Entrenador) gallarre).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista:");
		System.out.print(aguirre.getNombre() + " " + aguirre.getApellido() + " -> ");
		((Futbolista) aguirre).entrevista();

		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje:");
		System.out.print(perez.getNombre() + " " + perez.getApellido() + " -> ");
		((Masajista) perez).darMasaje();

	}
}
