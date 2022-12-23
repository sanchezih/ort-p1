package ar.edu.ort.p1.unidades.u1.practico01.ej01_ortdemy.src;

public class Usuario {

	private String id;
	private String nombre;
	private String email;
	private boolean esBecado;

	public Usuario(String id, String nombre, String email, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.esBecado = esBecado;
	}

	public String getId() {
		return id;
	}

	public boolean esBecado() {
		return esBecado;
	}

}
