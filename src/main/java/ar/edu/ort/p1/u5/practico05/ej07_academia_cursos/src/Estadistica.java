package ar.edu.ort.p1.u5.practico05.ej07_academia_cursos.src;

public class Estadistica {

	private String nombre;
	private double promedioEdad;

	public Estadistica(String nombre, double promedioEdad) {
		super();
		this.nombre = nombre;
		this.promedioEdad = promedioEdad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(double promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

	@Override
	public String toString() {
		return "Estadistica [nombre=" + nombre + ", promedioEdad=" + promedioEdad + "]";
	}

}
