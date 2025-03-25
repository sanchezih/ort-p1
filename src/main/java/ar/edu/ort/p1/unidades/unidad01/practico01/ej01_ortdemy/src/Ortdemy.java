package ar.edu.ort.p1.unidades.unidad01.practico01.ej01_ortdemy.src;

import java.util.ArrayList;
import java.util.List;

public class Ortdemy {

	private List<Usuario> usuarios;
	private List<Categoria> categorias;

	/*----------------------------------------------------------------------------*/

	public Ortdemy() {
		this.usuarios = new ArrayList<>();
		this.categorias = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo suscribirseACurso el cual recibe un ID
	 * de usuario y un ID de curso y debe retornar alguno de los siguientes
	 * resultados:
	 * 
	 * - CURSO_INEX: El curso no existe.
	 * 
	 * - USUARIO_INEX: El usuario no existe.
	 * 
	 * - YA_SUSCRIPTO: El usuario ya estaba suscripto en el curso.
	 * 
	 * - ES_AUTOR: El usuario que intenta suscribirse es el autor del curso.
	 * 
	 * - MAX_BECADOS: El usuario es becado y el curso ya cuenta con el maximo de
	 * becados posible.
	 * 
	 * - SUSCRIPTO_OK: El usuario se suscribio exitosamente al curso. Debe guardarse
	 * en la lista de suscriptos.
	 * 
	 * @param idUsuario
	 * @param idCurso
	 * @return
	 */
	public Resultado suscribirseACurso(String idUsuario, String idCurso) {

		Resultado resultado = Resultado.SUSCRIPTO_OK;
		Usuario usuario = null;
		Curso curso = null;

		usuario = buscarUsuario(idUsuario);
		if (usuario == null) {
			resultado = Resultado.USUARIO_INEX;
		} else {
			curso = buscarCurso(idCurso);
			if (curso == null) {
				resultado = Resultado.CURSO_INEX;
			} else {
				if (curso.getAutor() == usuario) {
					resultado = Resultado.ES_AUTOR;
				} else {
					if (usuario.esBecado() && curso.cupoBecadosLleno()) {
						resultado = Resultado.MAX_BECADOS;
					} else {
						if (curso.estaSuscripto(usuario)) {
							resultado = Resultado.YA_SUSCRIPTO;
						} else {
							curso.suscribir(usuario);
						}
					}
				}
			}
		}
		return resultado;
	}

	/**
	 * 
	 * @param idUsuario
	 * @return
	 */
	private Usuario buscarUsuario(String idUsuario) {
		int i = 0;
		Usuario usuarioEncontrado = null;

		while (i < this.usuarios.size() && usuarioEncontrado == null) {
			if (idUsuario.equals(this.usuarios.get(i).getId())) {
				usuarioEncontrado = this.usuarios.get(i);
			}
			i++;
		}
		return usuarioEncontrado;
	}

	/**
	 * 
	 * @param idCurso
	 * @return
	 */
	private Curso buscarCurso(String idCurso) {
		int i = 0;
		Curso cursoEncontrado = null;

		while (i < this.categorias.size() && cursoEncontrado == null) {
			cursoEncontrado = this.categorias.get(i).buscarCurso(idCurso);
			i++;
		}
		return cursoEncontrado;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	/**
	 * 
	 * @param categoria
	 */
	public void agregarCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void mostrarResultadoAlSuscribirseACurso(String idUsuario, String idCurso) {
		System.out.println(idUsuario + " en curso " + idCurso + " -> " + suscribirseACurso(idUsuario, idCurso));
	}
}
