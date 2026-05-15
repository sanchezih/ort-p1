package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.Curso;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class ListaDeCursosPorCodigoAsc extends ListaOrdenadaNodos<String, Curso> {

	@Override
	public int compare(Curso curso1, Curso curso2) {
		return curso1.getCodigo().compareTo(curso2.getCodigo());
	}

	@Override
	public int compareByKey(String clave, Curso curso) {
		return clave.compareTo(curso.getCodigo());
	}
}