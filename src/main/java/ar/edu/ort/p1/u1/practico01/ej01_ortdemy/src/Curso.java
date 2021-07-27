package ar.edu.ort.p1.u1.practico01.ej01_ortdemy.src;

import java.util.ArrayList;

public class Curso {

	private final static int MAX_BECADOS = 5;

	private int id;
	private String titulo;
	private double precio;
	private int valoracion;
	private ArrayList<Leccion> lecciones;
	private Usuario autor;
	private ArrayList<Usuario> suscriptores;

	public Usuario getAutor() {
		return autor;
	}

	public boolean estaSuscripto(Usuario user) {
		return this.suscriptores.contains(user);
	}

	public boolean cupoBecadosLleno() {
		// TODO Auto-generated method stub
		return false;
	}

	public void suscribir(Usuario user) {
		this.suscriptores.add(user);
	}
}
