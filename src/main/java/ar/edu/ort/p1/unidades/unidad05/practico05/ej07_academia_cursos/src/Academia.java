package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src;

import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeCursosPorCodigoAsc;
import ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src.listasordenadas.ListaDeCursosPorNivelAsc;
import ar.edu.ort.tp1.u5.tda.impl.ListaOrdenadaNodos;

public class Academia {

	private ListaOrdenadaNodos<String, Curso> listaDeCursosPorCodigoAsc = new ListaDeCursosPorCodigoAsc();
	private ListaOrdenadaNodos<NivelCurso, Curso> listaDeCursosPorNivelAsc = new ListaDeCursosPorNivelAsc();

	/*----------------------------------------------------------------------------*/

	public void agregarCurso(Curso curso) {
		this.listaDeCursosPorCodigoAsc.add(curso);
		this.listaDeCursosPorNivelAsc.add(curso);
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
		Curso curso = listaDeCursosPorCodigoAsc.search(codigo);

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
	public ListaOrdenadaNodos<NivelCurso, Curso> listadoDeCursosPorNivel() {
		return this.listaDeCursosPorNivelAsc;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void mostrarListaDeCursosOrdenadosDeMenorAMayorNivel() {
		System.out.println("Muestro una lista de cursos ordenados de menor a mayor nivel");
		for (Curso curso : this.listadoDeCursosPorNivel()) {
			System.out.println(curso.toString());
		}
		System.out.println();
	}

	/**
	 * 
	 * @param codigo
	 */
	public void mostrarLaEstadisticaDeUnCurso(String codigo) {
		System.out.println("Muestro la estadistica del curso " + codigo);
		Estadistica estadistica = obtenerEstadistica(codigo);
		System.out.println(estadistica);
		System.out.println();
	}

}
