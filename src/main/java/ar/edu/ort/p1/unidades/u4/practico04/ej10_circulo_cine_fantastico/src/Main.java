package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		Pelicula[] peliculasCicloVisitantes = { //
				new Pelicula("Alien"), //
				new Pelicula("Mars Attack"), //
				new Pelicula("Encuentros Cercanos"), //
				new Pelicula("Avatar"), //
				new Pelicula("El arribo") //
		};

		CicloDeCharlas cicloVisitantes = new CicloDeCharlas("Visitantes", peliculasCicloVisitantes,
				new Fecha(22, 9, 2020), 50);

		Espectador eloy = new Espectador("Eloy Ente");
		Espectador juan = new Espectador("Juan Pirulo");

		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 1));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(juan, 8));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 8));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 10));

		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 1));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(juan, 8));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 8));
		System.out.println(cicloVisitantes.registrarEspectadorEnCharla(eloy, 10));

		cicloVisitantes.verCartelera();

		Pelicula[] peliculasCicloClasicos = { //
				new Pelicula("El Padrino"), //
				new Pelicula("Pulp Fiction"), //
				new Pelicula("Casablanca"), //
				new Pelicula("El mago de Oz"), //
				new Pelicula("Ciudadano Kane") //
		};

		CicloDeCharlas cicloClasicos = new CicloDeCharlas("Clasicos", peliculasCicloClasicos, new Fecha(20, 10, 2021),
				10);

		Espectador virginia = new Espectador("Virginia");
		Espectador diego = new Espectador("Diego");

		System.out.println(cicloClasicos.registrarEspectadorEnCharla(virginia, 1));
		System.out.println(cicloClasicos.registrarEspectadorEnCharla(diego, 1));

		cicloClasicos.verCartelera();
	}

}
