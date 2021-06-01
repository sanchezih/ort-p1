package edu.ort.u5.tp5.ej01_dvds;

import edu.ort.u5.common.tad.nodos.PilaNodos;

public class Main {

	public static void main(String[] args) {

		PilaNodos<DVD> pilaDeDVDs = new PilaNodos<DVD>();
		pilaDeDVDs.push(new DVD("Verbatim", true));
		pilaDeDVDs.push(new DVD("Verbatim", false));
		pilaDeDVDs.push(new DVD("Verbatim", true));

		PilaNodos<Libro> pilaDeLibros = new PilaNodos<Libro>();
		pilaDeLibros.push(new Libro("ISBN", 30));
		pilaDeLibros.push(new Libro("ISBN", 10));
		pilaDeLibros.push(new Libro("ISBN", 20));

		Empleado e = new Empleado("Juan");
		System.out.println(e.cantDVDsRayados(pilaDeDVDs));
		System.out.println(e.paginasPromedio(pilaDeLibros));

	}

}
