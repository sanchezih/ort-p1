package ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src.listasordenadas;

import ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src.Curso;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeCursosPorCodigo extends ListaOrdenadaNodos<String, Curso> {

	@Override
	public int compare(Curso c1, Curso c2) {
		return c1.getCodigo().compareTo(c2.getCodigo());
	}

	@Override
	public int compareByKey(String clave, Curso curso) {
		int res = clave.compareTo(curso.getCodigo());
		return res;
	}
}