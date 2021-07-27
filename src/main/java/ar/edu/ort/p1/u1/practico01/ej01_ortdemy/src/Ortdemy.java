package ar.edu.ort.p1.u1.practico01.ej01_ortdemy.src;

import java.util.ArrayList;

public class Ortdemy {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Categoria> categorias;

	public Resultado suscribirseACurso(String idUsuario, String idCurso) {
		Resultado res = Resultado.SUSCRIPTO_OK;
		Usuario user;
		Curso curso;

		user = buscarUsuario(idUsuario);
		if (user == null) {
			res = Resultado.USUARIO_INEX;
		} else {
			curso = buscarCurso(idCurso);
			if (curso == null) {
				res = Resultado.CURSO_INEX;
			} else {
				if (curso.getAutor() == user) {
					res = Resultado.ES_AUTOR;
				} else {
					if (user.esBecado() && curso.cupoBecadosLleno()) {
						res = Resultado.MAX_BECADOS;
					} else {
						if (curso.estaSuscripto(user)) {
							res = Resultado.YA_SUSCRIPTO;
						} else {
							curso.suscribir(user);
						}
					}
				}
			}
		}
		return res;
	}

	private Curso buscarCurso(String id) {
		int i = 0;
		Curso cursoEncontrado = null;
		while (i < this.categorias.size() && cursoEncontrado == null) {
			cursoEncontrado = this.categorias.get(i).buscarCurso(id);
			i++;
		}
		return cursoEncontrado;
	}

}
