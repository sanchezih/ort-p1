package ar.edu.ort.p1.unidades.u1.ejemplos._enum._02_enums_con_atributos_y_metodos.src;

import ar.edu.ort.p1.util.UtilArrays;

/**
 * Ver https://www.youtube.com/watch?v=F8HSRnFGhYM
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		// Metodo estatico values, el cual devuelve un array del enum
		Continente[] continentes = Continente.values();

		/*----------------------------------------------------------------------------*/

		// Muestro los objetos
		System.out.println("Muestro el array devuelto por el metodo values");
		UtilArrays.mostrarGenerico(continentes);

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Ejecuto densidadPoblacion() por cada objeto
		System.out.println("Ejecuto densidadPoblacion() por cada objeto");
		for (int i = 0; i < continentes.length; i++) {
			System.out.println(continentes[i].densidadPoblacion());
		}

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Llamo a distintos metodos de cada enum
		System.out.println("Llamo a distintos metodos de cada enum");
		for (int i = 0; i < continentes.length; i++) {
			System.out.println(
					"El continente " + continentes[i].name() + " tiene " + continentes[i].densidadPoblacion() + " km2");
		}
	}
}