package ar.edu.ort.p1.unidades.u5.practico05.ej07_academia_cursos.src;

public class Estadistica {

	private String nombre;
	private double promedioEdad;

	public Estadistica(String nombre, double promedioEdad) {
		this.nombre = nombre;
		this.promedioEdad = promedioEdad;
	}

	public double getPromedioEdad() {
		return promedioEdad;
	}

	@Override
	public String toString() {
		return "Estadistica [nombre=" + nombre + ", promedioEdad=" + promedioEdad + "]";
	}

}
