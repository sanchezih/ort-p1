package ar.edu.ort.p1.unidades.unidad01.practico01.ej09_ortify.src;

import java.util.ArrayList;

public class Cancion {

	private String id;
	private String nombre;
	private double duracion;
	private ArrayList<Usuario> likers;

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param duracion
	 */
	public Cancion(String id, String nombre, double duracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.likers = new ArrayList<Usuario>();
	}

	public double getDuracion() {
		return duracion;
	}

	public boolean dioLike(Usuario user) {
		return this.likers.contains(user);
	}

	public void borrarLiker(Usuario user) {
		this.likers.remove(user);
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", likers=" + likers + "]";
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void addLiker(Usuario usuario) {
		this.likers.add(usuario);
	}

}
