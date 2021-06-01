package edu.ort.u5.tp5.ej01_libros_dvds;

import edu.ort.u5.common.tad.nodos.PilaNodos;

public class Main {

	public static void main(String[] args) {

		PilaNodos<DVD> pilaDeDVDs = new PilaNodos<DVD>();
		pilaDeDVDs.push(new DVD("Verbatim", true));
		pilaDeDVDs.push(new DVD("Sony", false));
		pilaDeDVDs.push(new DVD("TDK", true));

		PilaNodos<Libro> pilaDeLibros = new PilaNodos<Libro>();
		pilaDeLibros.push(new Libro("978-987-86-4331-1", 319));
		pilaDeLibros.push(new Libro("978-987-3832-50-5", 285));
		pilaDeLibros.push(new Libro("978-987-1949-68-7", 292));

		Empleado e = new Empleado("Juan");
		System.out.println("La cantidad de DVDs rayados es " + e.cantDVDsRayados(pilaDeDVDs));
		System.out.println("El promedio es " + e.paginasPromedio(pilaDeLibros));

	}

}
