package ar.edu.ort.p1.unidades.u1.practico01.ej01_ortdemy.src;

import java.util.ArrayList;

public class Categoria {

	private String id;
	private String nombre;
	private ArrayList<Curso> cursos;

	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
	}

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

	public void agregarCurso(Curso c) {
		this.cursos.add(c);
	}

}
