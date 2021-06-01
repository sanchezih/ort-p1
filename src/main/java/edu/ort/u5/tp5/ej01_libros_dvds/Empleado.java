package edu.ort.u5.tp5.ej01_libros_dvds;

import edu.ort.u5.common.tad.nodos.PilaNodos;

public class Empleado {
	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int cantDVDsRayados(PilaNodos<DVD> pilaDVDs) {

		PilaNodos<DVD> pilaAux = new PilaNodos<DVD>();

		int cantRayados = 0;

		while (!pilaDVDs.isEmpty()) {
			DVD elDVD = pilaDVDs.pop();
			pilaAux.push(elDVD);
			if (elDVD.isRayado()) {
				cantRayados++;
			}
		}

		while (!pilaAux.isEmpty()) {
			pilaDVDs.push(pilaAux.pop());
		}
		return cantRayados;

	}

	public double paginasPromedio(PilaNodos<Libro> pilaLibros) {
		PilaNodos<Libro> pilaAux = new PilaNodos<Libro>();
		int cantLibros = 0;
		int acuPaginas = 0;
		double promedio = 0;

		while (!pilaLibros.isEmpty()) {
			Libro elLibro = pilaLibros.pop();
			pilaAux.push(elLibro);
			cantLibros++;
			acuPaginas += elLibro.getNroPaginas();
		}

		while (!pilaAux.isEmpty()) {
			pilaLibros.push(pilaAux.pop());
		}

		if (cantLibros > 0) {
			promedio = acuPaginas / (double) cantLibros;
		}
		return promedio;

	}

}
