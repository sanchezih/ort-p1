package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		// Creo los conjuntos de peliculas que se daran en cada ciclo

		Pelicula[] peliculasCicloVisitantes = { //
				new Pelicula("Interstellar"), //
				new Pelicula("Pickpocket"), //
				new Pelicula("Mars Attacks!"), //
				new Pelicula("Star Wars"), //
				new Pelicula("Pulp Fiction") //
		};

		/*----------------------------------------------------------------------------*/

		// Creo los ciclos de charlas y los muestro

		CicloDeCharlas cicloVisitantes = new CicloDeCharlas("Visitantes", peliculasCicloVisitantes,
				new Fecha(24, 8, 2021), 50);
		cicloVisitantes.verCartelera();

		/*----------------------------------------------------------------------------*/

		// Creo los espectadores

		Espectador eloy = new Espectador("Eloy Ente");
		Espectador juan = new Espectador("Juan Pirulo");
		Espectador virginia = new Espectador("Virginia");
		Espectador diego = new Espectador("Diego");

		/*----------------------------------------------------------------------------*/

		// Registro a los espectadores en las charlas

		System.out.println();
		System.out.println("Registro a los espectadores en las charlas");

		System.out.println(
				"\tEloy se puede registrar en la charla 1?: " + cicloVisitantes.registrarEspectadorEnCharla(eloy, 1));
		System.out.println(
				"\tJuan se puede registrar en la charla 8?: " + cicloVisitantes.registrarEspectadorEnCharla(juan, 8));
		System.out.println(
				"\tEloy se puede registrar en la charla 8?: " + cicloVisitantes.registrarEspectadorEnCharla(eloy, 8));
		System.out.println(
				"\tEloy se puede registrar en la charla 10?: " + cicloVisitantes.registrarEspectadorEnCharla(eloy, 10));
		System.out.println(
				"\tEloy se puede registrar en la charla 1?: " + cicloVisitantes.registrarEspectadorEnCharla(eloy, 1));
		System.out.println(
				"\tJuan se puede registrar en la charla 8?: " + cicloVisitantes.registrarEspectadorEnCharla(juan, 8));
		System.out.println("\tVirginia se puede registrar en la charla 1?: "
				+ cicloVisitantes.registrarEspectadorEnCharla(virginia, 1));
		System.out.println(
				"\tDiego se puede registrar en la charla 2?: " + cicloVisitantes.registrarEspectadorEnCharla(diego, 2));
		System.out.println("\tVirginia se puede registrar en la charla 5?: "
				+ cicloVisitantes.registrarEspectadorEnCharla(virginia, 5));

		/*----------------------------------------------------------------------------*/

		System.out.println();
		cicloVisitantes.verCartelera();

	}

}
