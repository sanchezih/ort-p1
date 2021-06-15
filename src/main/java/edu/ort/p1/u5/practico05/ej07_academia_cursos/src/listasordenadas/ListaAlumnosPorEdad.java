package edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.Alumno;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaAlumnosPorEdad extends ListaOrdenadaNodos<Integer, Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a2.getEdad() - a1.getEdad();
	}

	@Override
	public int compareByKey(Integer clave, Alumno a) {
		return clave - a.getEdad();
	}
}