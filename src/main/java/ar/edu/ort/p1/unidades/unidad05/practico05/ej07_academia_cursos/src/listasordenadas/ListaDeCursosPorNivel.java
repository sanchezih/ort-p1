package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.Curso;
import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.NivelCurso;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeCursosPorNivel extends ListaOrdenadaNodos<NivelCurso, Curso> {

	@Override
	public int compare(Curso curso1, Curso curso2) {
		return curso1.getNivel().ordinal() - curso2.getNivel().ordinal();
	}

	@Override
	public int compareByKey(NivelCurso nivel, Curso curso) {
		return nivel.ordinal() - curso.getNivel().ordinal();
	}
}
