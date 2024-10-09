package ar.edu.ort.p1.unidades.unidad05.practico05.ej01_libros_dvds.src;

import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class Empleado {

	private String nombre;

	/*----------------------------------------------------------------------------*/

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo cantDVDsRayados que reciba por
	 * parametro una pila de DVDs y devuelva la cantidad de DVDs rayados que haya
	 * 
	 * @param pilaDVDs
	 * @return
	 */
	public int cantDVDsRayados(Pila<DVD> pilaDVDs) {

		Pila<DVD> pilaAux = new PilaNodos<>();
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

	/**
	 * Ejercicio C: La explotacion del metodo paginasPromedio que reciba por
	 * parametro una pila de libros y devuelva el promedio de cantidad de hojas
	 * entre todos ellos.
	 * 
	 * @param pilaLibros
	 * @return
	 */
	public double paginasPromedio(Pila<Libro> pilaLibros) {

		Pila<Libro> pilaAux = new PilaNodos<>();
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
