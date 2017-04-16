package herencia.src;

import java.util.ArrayList;
import herencia.src.Seleccion.Entrenador;
import herencia.src.Seleccion.Futbolista;
import herencia.src.Seleccion.Masajista;
import herencia.src.Seleccion.IntegranteDeSeleccion;

public class Main {

	// ArrayList de objetos IntegranteDeSeleccion. Idenpendientemente de la
	// clase hija a la que pertenezca el objeto
	public static ArrayList<IntegranteDeSeleccion> integrantes = new ArrayList<IntegranteDeSeleccion>();

	public static void main(String[] args) {

		// CREO EL EQUIPO
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
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
				"\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
		delBosque.dirigirPartido();
		iniesta.jugarPartido();
	}
}