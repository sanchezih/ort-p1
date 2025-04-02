package ar.edu.ort.p1.unidades.unidad03.practico03.ej13_sophie.src;

public abstract class Fuente implements Calificable {
	
	private String nombre;
	private String path;

	public Fuente(String nombre, String path) {
		this.nombre = nombre;
		this.path = path;
	}

	@Override
	public String toString() {
		return "Fuente [Nombre=" + nombre + ", Path=" + path + "]";
	}

}
