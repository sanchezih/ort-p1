package ar.edu.ort.p1.examenes.oop.gestion_auditorias.src;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		// Se crean los elementos auditables
		Sistema sistemaDeLegales01 = new Sistema("Sistema de asuntos legales 01", true, 1500);
		Sistema sistemaDeLegales02 = new Sistema("Sistema de asuntos legales 02", true, 4);

		Sistema sistemaDeCompras01 = new Sistema("Sistema de compras 01", true, 2);

		Proceso procesoDeOnboarding = new Proceso("PO950", 16, false, false);
		Proceso procesoDeFidelizacion = new Proceso("PA247", 4, true, false);

		// Se crean las observaciones
		ObservacionInterna oi01 = new ObservacionInterna("No se cumplen politicas de privacidad", "Una descripcion",
				new Empleado("Felipe", "Perez", 78524), new Fecha(3, 3, 2015), sistemaDeLegales01, false);
		oi01.agregarCompromiso(new Compromiso("Se hara...", new Fecha(3, 3, 2022)));

		ObservacionExterna oe01 = new ObservacionExterna("No cumple con politica 671", "Una descripcion",
				new Empleado("Maria", "Saravia", 96699), new Fecha(4, 3, 2015), sistemaDeLegales01, "asd");
		oe01.agregarCompromiso(new Compromiso("Se hara...", new Fecha(3, 3, 2015)));

		// Se crean los areas
		Area areaLegales = new Area("Legales", 12, new Empleado("Fernanda", "Jimenez", 69822));
		Area areaCompras = new Area("Compras", 4, new Empleado("Marcelo", "Gonzalez", 12114));

		// Se agregan las observaciones a los areas
		areaLegales.agregarObservacion(oe01);
		areaLegales.agregarObservacion(oi01);

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Test ejercicio B");
		System.out.println("El area de legales tiene " + areaLegales.obtenerCantObservacionesExternas()
				+ " observaciones externas");

		System.out.println();

		// Test ejercicio D
		System.out.println("Test ejercicio D");
		System.out.println("Las observaciones vencidas son las siguientes:");

		for (Observacion observacion : areaLegales.obtenerObservacionesVencidas()) {
			System.out.println(observacion.mostrarGson());
		}

		System.out.println();

		// Test ejercicio F
		System.out.println("Test ejercicio F");
		System.out.println("Las observaciones criticas son las siguientes:");
		areaLegales.mostrarObservacionesCriticas();

	}

}
