package ar.edu.ort.p1.unidades.unidad03.practico03.ej13_sophie.src;

import ar.edu.ort.p1.util.UtilArraylist;

public class Main {

	public static void main(String[] args) {

		Metodo buscarCurso = new Metodo("buscarCurso", 1, 8, 5);
		Metodo agregarCurso = new Metodo("agregarCurso", 1, 1, 0);

		FuenteProgramacion categoria = new FuenteProgramacion("Categoria", "/home/user/source/Categoria.java",
				TipoProgramacion.JAVA);
		categoria.agregarMetodo(buscarCurso);
		categoria.agregarMetodo(agregarCurso);

		/* ############################ */

		Metodo cupoBecadosLleno = new Metodo("cupoBecadosLleno", 0, 6, 1);
		Metodo suscribir = new Metodo("suscribir", 1, 1, 0);

		FuenteProgramacion curso = new FuenteProgramacion("Curso", "/home/user/source/Curso.java",
				TipoProgramacion.JAVA);
		curso.agregarMetodo(cupoBecadosLleno);
		curso.agregarMetodo(suscribir);

		Programa ortdemy = new Programa("P01", "ORTDemy", "Esther", true);
		ortdemy.agregarFuente(categoria);
		ortdemy.agregarFuente(curso);

		/*----------------------------------------------------------------------------*/

		Metodo devolverLlave = new Metodo("devolverLlave", 1, 12, 2);
		Metodo existeLlave = new Metodo("existeLlave", 1, 1, 0);

		FuenteProgramacion tablero = new FuenteProgramacion("Tablero", "/home/user/source/Tablero.cs",
				TipoProgramacion.C_SHARP);
		tablero.agregarMetodo(devolverLlave);
		tablero.agregarMetodo(existeLlave);

		/* ############################ */

		FuenteProgramacion informeGarage = new FuenteProgramacion("InformeGarage", "/home/user/source/InformeGarage.cs",
				TipoProgramacion.C_SHARP);

		Programa ortparking = new Programa("P02", "ORTParking", "Marcelo", true);
		ortparking.agregarFuente(tablero);
		ortparking.agregarFuente(informeGarage);

		/*----------------------------------------------------------------------------*/

		Sophie sophie = new Sophie();
		sophie.agregarPrograma(ortdemy);
		sophie.agregarPrograma(ortparking);

		// Test ejercicio C
		System.out.println("-> Test ejercicio C");
		System.out.println("Los programas cuyo indice de calidad es menor a 10 son: ");
		UtilArraylist.listarElementos(sophie.programasPorDebajoDe(10));

		// Test ejercicio D
		System.out.println("\n-> Test ejercicio D");

		System.out.println("\nMuestro los detalles del metodo \"buscarCurso\"");
		ortdemy.mostrarDetalleDeMetodo("buscarCurso");

		System.out.println("\nMuestro los detalles del metodo \"inexistente\"");
		ortdemy.mostrarDetalleDeMetodo("inexistente");

		System.out.println("\nMuestro los detalles del metodo \"devolverLlave\"");
		ortparking.mostrarDetalleDeMetodo("devolverLlave");

		// Test ejercicio E
		System.out.println("\n-> Test ejercicio E");
		System.out.println("Los fuentes cuyo indice de calidad supera al promedio son: ");
		UtilArraylist.listarElementos(ortdemy.listadoFuentesMayoresAlPromedio());

	}

}
