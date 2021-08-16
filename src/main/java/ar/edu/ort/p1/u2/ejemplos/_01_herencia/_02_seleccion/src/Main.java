package ar.edu.ort.p1.u2.ejemplos._01_herencia._02_seleccion.src;

import java.util.ArrayList;

import ar.edu.ort.p1.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Entrenador;
import ar.edu.ort.p1.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Futbolista;
import ar.edu.ort.p1.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.IntegranteDeSeleccion;
import ar.edu.ort.p1.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Masajista;

public class Main {

	// ArrayList de objetos IntegranteDeSeleccion. Idenpendientemente de la clase
	// hija a la que pertenezca el objeto
	public static ArrayList<IntegranteDeSeleccion> integrantes = new ArrayList<IntegranteDeSeleccion>();

	public static void main(String[] args) {

		// CREO EL EQUIPO
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
		delBosque.dirigirEntrenamiento();
		iniesta.entrenar();

		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		raulMartinez.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println(
				"\nPartido de Futbol: Solamente el entrenador y el futbolista tiene metodos para el partido de futbol:");
		delBosque.dirigirPartido();
		iniesta.jugarPartido();
	}
}