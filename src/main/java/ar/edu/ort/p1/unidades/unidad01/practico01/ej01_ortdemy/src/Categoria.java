package ar.edu.ort.p1.unidades.unidad01.practico01.ej01_ortdemy.src;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ihsanch
 *
 */
public class Categoria {

	private String id;
	private String nombre;
	private List<Curso> cursos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param id
	 * @param nombre
	 */
	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Curso buscarCurso(String id) {
		int i = 0;
		Curso cursoEncontrado = null;

		while (i < this.cursos.size() && cursoEncontrado == null) {
			if (id.equals(this.cursos.get(i).getId())) {
				cursoEncontrado = this.cursos.get(i);
			}
			i++;
		}
		return cursoEncontrado;
	}

	/**
	 * 
	 * @param curso
	 */
	public void agregarCurso(Curso curso) {
		this.cursos.add(curso);
	}

}
