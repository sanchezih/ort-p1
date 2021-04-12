package polimorfismoConInterfaces.src;


import java.util.ArrayList;

import polimorfismoConInterfaces.src.PolimorfismoInterface.Entrenador;
import polimorfismoConInterfaces.src.PolimorfismoInterface.Futbolista;
import polimorfismoConInterfaces.src.PolimorfismoInterface.Masajista;
import polimorfismoConInterfaces.src.PolimorfismoInterface.SeleccionFutbol;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija
	// a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println(
				"\nEntrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.entrenar();
		}

		// PARTIDO DE FUTBOL
		System.out.println(
				"\nPartido de Futbol: Todos los integrantes tienen su funcion en un partido (Especializacion)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.jugarPartido();
		}

		// PLANIFICAR ENTRENAMIENTO
		System.out.println(
				"\nPlanificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento:");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		((Entrenador) delBosque).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista:");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		((Futbolista) iniesta).entrevista();

		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " -> ");
		((Masajista) raulMartinez).darMasaje();

	}
}