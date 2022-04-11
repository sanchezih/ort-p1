package ar.edu.ort.p1.unidades.u3.practico03.ej12_cocode_v1.src;

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
