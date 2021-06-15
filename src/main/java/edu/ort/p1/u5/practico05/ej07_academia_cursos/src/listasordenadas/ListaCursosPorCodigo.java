package edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.Curso;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaCursosPorCodigo extends ListaOrdenadaNodos<String, Curso> {

	@Override
	public int compare(Curso curso1, Curso curso2) {
		return curso1.getCodigo().compareTo(curso2.getCodigo());
	}

	@Override
	public int compareByKey(String clave, Curso curso) {
		return clave.compareTo(curso.getCodigo());
	}
}