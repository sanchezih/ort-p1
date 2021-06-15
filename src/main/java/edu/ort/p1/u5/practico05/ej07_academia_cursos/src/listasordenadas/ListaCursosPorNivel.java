package edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.Curso;
import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.NivelCurso;
import edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaCursosPorNivel extends ListaOrdenadaNodos<NivelCurso, Curso> {

	@Override
	public int compare(Curso c1, Curso c2) {
	return c1.getNivel().ordinal() - c2.getNivel().ordinal();
	}

	@Override
	public int compareByKey(NivelCurso clave, Curso c) {
		return clave.ordinal() - c.getNivel().ordinal();
	}
}
