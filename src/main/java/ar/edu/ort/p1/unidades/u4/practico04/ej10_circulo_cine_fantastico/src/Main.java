package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;


public class Main {

	public static void main(String[] args) {

		Pelicula[] peliculas = { new Pelicula("Alien"), new Pelicula("Mars Attack"),
				new Pelicula("Encuentros Cercanos"), new Pelicula("Avatar"), new Pelicula("El arribo") };

		CicloDeCharlas ciclo = new CicloDeCharlas("visitantes", peliculas, new Fecha(22, 9, 2020), 50);

		Espectador esp1 = new Espectador("Eloy Ente");
		Espectador esp2 = new Espectador("Juan Pirulo");

		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 1));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp2, 8));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 8));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 10));

		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 1));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp2, 8));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 8));
		System.out.println(ciclo.registrarEspectadorEnCharla(esp1, 10));

		ciclo.verCartelera();

	}

}
