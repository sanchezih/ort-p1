package ar.edu.ort.p1.unidades.u1.practico01.ej04_droides.src;

public class Pieza {
	private String nombre;

	public Pieza(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
