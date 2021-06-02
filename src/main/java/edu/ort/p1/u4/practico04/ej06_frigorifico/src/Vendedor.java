package edu.ort.p1.u4.practico04.ej06_frigorifico.src;

public class Vendedor {

	private String id;
	private String nombre;

	public Vendedor(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
