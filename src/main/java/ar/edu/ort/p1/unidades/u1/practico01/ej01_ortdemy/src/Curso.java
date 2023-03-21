package ar.edu.ort.p1.unidades.u1.practico01.ej01_ortdemy.src;

import java.util.ArrayList;

public class Curso {

	private final static int MAX_BECADOS = 2;

	private String id;
	private String titulo;
	private double precio;
	private int valoracion;
	private ArrayList<Leccion> lecciones;
	private Usuario autor;
	private ArrayList<Usuario> suscriptores;

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
		super();
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

	public void suscribir(Usuario usuario) {
		this.suscriptores.add(usuario);
	}
}
