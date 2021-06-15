package edu.ort.p1.u5.practico05.ej07_academia_cursos.src;

import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaCursosPorCodigo;
import edu.ort.p1.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaCursosPorNivel;

public class Academia {

	private ListaCursosPorCodigo cursosPorCodigo = new ListaCursosPorCodigo();
	private ListaCursosPorNivel cursosPorNivel = new ListaCursosPorNivel();

	public void agregarCurso(Curso c) {
		this.cursosPorCodigo.add(c);
		this.cursosPorNivel.add(c);
	}

	public Estadistica obtenerEstadistica(String codigo) {
		Estadistica e = null;
		double promedio = 0;
		Curso curso = cursosPorCodigo.search(codigo);

		if (curso != null) {
			System.out.println("El curso fue encontrado...");
			promedio = curso.calcularPromedio();
			e = new Estadistica(curso.getTitulo(), promedio);
		}
		return e;
	}

	public ListaCursosPorNivel listadoDeCursosPorNivel() {
		return this.cursosPorNivel;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void mostrarListaDeCursosOrdenadosDeMenorAMayorNivel() {
		System.out.println("\nMuestro una lista de cursos ordenados de menor a mayor nivel");
		for (Curso c : listadoDeCursosPorNivel()) {
			System.out.println(c.toString());
		}
	}

	public void mostrarLaEstadisticaDeUnCurso(String codigo) {
		System.out.println("Muestro la estadistica del curso " + codigo);
		Estadistica estadistica = obtenerEstadistica(codigo);
		System.out.println(estadistica);
	}

}
