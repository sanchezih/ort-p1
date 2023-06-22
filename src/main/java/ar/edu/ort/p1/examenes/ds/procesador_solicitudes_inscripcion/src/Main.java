package ar.edu.ort.p1.examenes.ds.procesador_solicitudes_inscripcion.src;

import ar.edu.ort.p1.util.UtilCola;

public class Main {

	public static void main(String[] args) {

		Colegio colegio = new Colegio();

		// Test ejercicio C
		colegio.informarEstadistica();

		System.out.println("Muestro la cola de solicitudes antes de procesar...");
		UtilCola.mostrar(colegio.getSolicitudes());

		// Test ejercicio A
		colegio.procesarSolicitudes();

		System.out.println();
		System.out.println("Muestro la cola de solicitudes luego de procesar...");
		UtilCola.mostrar(colegio.getSolicitudes());

		System.out.println();

		// Test ejercicio B
		System.out.println("Ejercicio B");
		colegio.informarDisponibles();

	}

}
