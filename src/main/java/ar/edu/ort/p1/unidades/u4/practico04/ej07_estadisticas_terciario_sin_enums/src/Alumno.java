package ar.edu.ort.p1.unidades.u4.practico04.ej07_estadisticas_terciario_sin_enums.src;

public class Alumno {

	private String legajo;
	private String apellido;
	private int edad;

	public Alumno(String legajo, String apellido, int edad) {
		this.legajo = legajo;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

}
