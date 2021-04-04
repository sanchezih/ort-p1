package polimorfismo.src;

import java.util.ArrayList;

import polimorfismo.src.polimorfismo.Entrenador;
import polimorfismo.src.polimorfismo.Futbolista;
import polimorfismo.src.polimorfismo.IntegranteDeSeleccion;
import polimorfismo.src.polimorfismo.Masajista;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija
	// a la que pertenezca el objeto
	public static ArrayList<IntegranteDeSeleccion> integrantes = new ArrayList<IntegranteDeSeleccion>();

	public static void main(String[] args) {

		// El polimorfismo consiste en declarar un objeto de una clase, pero
		// instanciarlo como un descendiente de dicha clase.
		IntegranteDeSeleccion gallardo = new Entrenador(1, "Marcelo", "Gallardo", 41, 52418); // Upcasting
		IntegranteDeSeleccion ponzio = new Futbolista(2, "Leonardo", "Ponzio", 34, 5, "Volante");
		IntegranteDeSeleccion perez = new Masajista(3, "Juan", "Perez", 47, "Licenciado en Fisioterapia", 23);

		integrantes.add(gallardo);
		integrantes.add(ponzio);
		integrantes.add(perez);

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
		System.out.println(
				"\nEntrenamiento: Todos los integrantes tienen su funcin en un entrenamiento (Especializacion)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnEntrenamiento();
		}

		// PARTIDO DE FUTBOL
		System.out.println(
				"\nPartido de Futbol: Todos los integrantes tienen su funcion en un partido (Especializacion)");
		for (IntegranteDeSeleccion integrante : integrantes) {
			integrante.participarEnPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"\nPlanificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento:");
		System.out.print(gallardo.getNombre() + " " + gallardo.getApellido() + " -> ");
		((Entrenador) gallardo).planificarEntrenamiento(); // Downcasting

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista:");
		System.out.print(ponzio.getNombre() + " " + ponzio.getApellido() + " -> ");
		((Futbolista) ponzio).entrevista();

		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje:");
		System.out.print(perez.getNombre() + " " + perez.getApellido() + " -> ");
		((Masajista) perez).darMasaje();

	}
}
