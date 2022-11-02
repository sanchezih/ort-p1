package ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src;

import ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeCursosPorCodigo;
import ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeCursosPorNivel;

public class Academia {

	private ListaDeCursosPorCodigo listaDecursosPorCodigo = new ListaDeCursosPorCodigo();
	private ListaDeCursosPorNivel listaDeCursosPorNivel = new ListaDeCursosPorNivel();

	public void agregarCurso(Curso c) {
		this.listaDecursosPorCodigo.add(c);
		this.listaDeCursosPorNivel.add(c);
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo obtenerEstadistica, que reciba por
	 * parametro el codigo de un curso y se retornen los siguientes datos:
	 * 
	 * I. Nombre del curso.
	 * 
	 * II. Promedio de edad de los alumnos que posee.
	 * 
	 * @param codigo
	 * @return
	 */
	public Estadistica obtenerEstadistica(String codigo) {
		Estadistica estadistica = null;
		double promedio = 0;
		Curso curso = listaDecursosPorCodigo.search(codigo);

		if (curso != null) {
			System.out.println("El curso fue encontrado...");
			promedio = curso.calcularPromedio();
			estadistica = new Estadistica(curso.getTitulo(), promedio);
		}
		return estadistica;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo listadoDeCursosPorNivel, que retorne
	 * una lista de cursos ordenados de menor a mayor nivel.
	 * 
	 * @return
	 */
	public ListaDeCursosPorNivel listadoDeCursosPorNivel() {
		return this.listaDeCursosPorNivel;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void mostrarListaDeCursosOrdenadosDeMenorAMayorNivel() {
		System.out.println("Muestro una lista de cursos ordenados de menor a mayor nivel");
		for (Curso c : this.listadoDeCursosPorNivel()) {
			System.out.println(c.toString());
		}
		System.out.println();
	}

	public void mostrarLaEstadisticaDeUnCurso(String codigo) {
		System.out.println("Muestro la estadistica del curso " + codigo);
		Estadistica estadistica = obtenerEstadistica(codigo);
		System.out.println(estadistica);
		System.out.println();
	}

}
