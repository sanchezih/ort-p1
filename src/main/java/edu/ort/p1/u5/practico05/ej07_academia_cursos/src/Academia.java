package edu.ort.p1.u5.practico05.ej07_academia_cursos.src;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaCursosPorCodigo;
import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaCursosPorNivel;

public class Academia {

	private ListaCursosPorCodigo cursos = new ListaCursosPorCodigo();
	private ListaCursosPorNivel cursosPorNivel = new ListaCursosPorNivel();

	public ListaCursosPorNivel getCursosPorNivel() {
		return cursosPorNivel;
	}

	/*
	 * public Estadistica obtenerEstadistica(String codigo) { Curso curso; curso =
	 * this.cursos.search(codigo); asumimos que encontramos el curso siempre return
	 * new Estadistica(curso.getTitulo(), curso.obtenerPromedioEdadAlumnos());
	 * 
	 * }
	 */

	public ListaCursosPorNivel listadoDeCursosPorNivel() {
		return cursosPorNivel;
	}
}
