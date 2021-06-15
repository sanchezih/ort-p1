package edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.Alumno;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaAlumnosPorEdad extends ListaOrdenadaNodos<Integer, Alumno> {

	@Override
	public int compare(Alumno dato1, Alumno dato2) {
		return dato1.getEdad() - dato2.getEdad();
	}

	@Override
	public int compareByKey(Integer clave, Alumno elemento) {
		return clave - elemento.getEdad();
	}
}