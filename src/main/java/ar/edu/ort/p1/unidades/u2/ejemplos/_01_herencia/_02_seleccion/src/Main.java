package ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src;

import java.util.ArrayList;

import ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Entrenador;
import ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Futbolista;
import ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.IntegranteDeSeleccion;
import ar.edu.ort.p1.unidades.u2.ejemplos._01_herencia._02_seleccion.src.seleccion.Masajista;

public class Main {

	/*
	 * Se declara un ArrayList de objetos IntegranteDeSeleccion. Contendra
	 * integrantes, idenpendientemente de la clase hija a la que pertenezca el
	 * objeto
	 */
	public static ArrayList<IntegranteDeSeleccion> integrantes = new ArrayList<IntegranteDeSeleccion>();

	public static void main(String[] args) {

		// Creacion del equipo
		Entrenador entrenador = new Entrenador(1, "Bruno", "Diaz", 60, "284EZ89");
		Futbolista futbolista = new Futbolista(2, "Ricardo", "Tapia", 29, 6, "Lateral Derecho");
		Masajista masajista = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(entrenador);
		integrantes.add(futbolista);
		integrantes.add(masajista);

		// Concentracion
		System.out.println("1.Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.concentrarse();
		}

		// Viaje
		System.out.println("\n2. Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.viajar();
		}

		// Entrenamiento
		System.out.println(
				"\n3. Entrenamiento: Solamente el entrenador y el futbolista tienen metodos para hacer algo en un entrenamiento:");
		entrenador.dirigirEntrenamiento();
		futbolista.entrenar();

		// Masaje
		System.out.println("\n4. Masaje: Solo el masajista tiene el metodo para dar un masaje:");
		masajista.darMasaje();

		// Partido de futbol
		System.out.println(
				"\n5. Partido de Futbol: Solamente el entrenador y el futbolista tienen metodos para hacer algo en un partido de futbol:");
		entrenador.dirigirPartido();
		futbolista.jugarPartido();
	}
}