package ar.edu.ort.p1.examenes.ds.procesador_solicitudes_inscripcion.src;

public class Alumno {

	public final static int MAX_ZONA = 3;
	private String documento;
	private String nombre;
	private float promedio;
	private int zona;

	public Alumno(String documento, String nombre, float promedio, int zona) {
		this.documento = documento;
		this.nombre = nombre;
		this.promedio = promedio;
		this.zona = zona;
	}

	public float getPromedio() {
		return promedio;
	}

	public int getZona() {
		return zona;
	}

	@Override
	public String toString() {
		return "Alumno [documento=" + documento + ", nombre=" + nombre + ", promedio=" + promedio + ", zona=" + zona
				+ "]";
	}

}
