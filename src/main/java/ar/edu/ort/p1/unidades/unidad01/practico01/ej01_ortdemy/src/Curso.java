package ar.edu.ort.p1.unidades.unidad01.practico01.ej01_ortdemy.src;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ihsanch
 *
 */
public class Curso {

	private final static int MAX_BECADOS = 2;

	private String id;
	private String titulo;
	private double precio;
	private int valoracion;
	private List<Leccion> lecciones;
	private Usuario autor;
	private List<Usuario> suscriptores;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param id
	 * @param titulo
	 * @param precio
	 * @param valoracion
	 * @param autor
	 */
	public Curso(String id, String titulo, double precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.lecciones = new ArrayList<Leccion>();
		this.autor = autor;
		this.suscriptores = new ArrayList<Usuario>();
	}

	/*----------------------------------------------------------------------------*/

	public String getId() {
		return id;
	}

	public Usuario getAutor() {
		return autor;
	}

	/**
	 * 
	 * @param usuario
	 * @return
	 */
	public boolean estaSuscripto(Usuario usuario) {
		return this.suscriptores.contains(usuario);
	}

	/**
	 * 
	 * @return
	 */
	public boolean cupoBecadosLleno() {

		int i = 0;
		int cantBecados = 0;

		while (i < this.suscriptores.size() && cantBecados < MAX_BECADOS) {
			if (this.suscriptores.get(i).esBecado()) {
				cantBecados++;
			}
			i++;
		}
		return cantBecados >= MAX_BECADOS;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void suscribir(Usuario usuario) {
		this.suscriptores.add(usuario);
	}
}
