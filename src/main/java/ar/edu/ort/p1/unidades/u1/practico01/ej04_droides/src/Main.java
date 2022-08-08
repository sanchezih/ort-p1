package ar.edu.ort.p1.unidades.u1.practico01.ej04_droides.src;

/**
 * Usar https://jsonvisio.com/editor
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("PARA ESTE EJERCICIO SE ASUME");
		System.out.println("\t1. Cada Droide tiene 6 piezas");
		System.out.println("\t2. Cada Droide puede tener como maximo 3 Droides fuera de servicio\n");

		Droide a10 = new Droide("A10");
		Droide h91 = new Droide("H91");
		Droide x25 = new Droide("X25");

		System.out.println(a10.mostrar());
		System.out.println("Intento auto-repararme: " + a10.autoRepararse());
		System.out.println(a10.mostrar());

		System.out.println();

		System.out.println(h91.mostrar());
		System.out.println("Intento auto-repararme: " + h91.autoRepararse());
		System.out.println(h91.mostrar());

		System.out.println();

		System.out.println(x25.mostrar());
		System.out.println("Intento auto-repararme: " + x25.autoRepararse());
		System.out.println(x25.mostrar());

	}

}
