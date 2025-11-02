package ar.edu.ort.p1.unidades.unidad05.practico05.ej07_academia_cursos.src;

public class Alumno {

	private String dni;
	private String nombre;
	private Integer edad;

	/*----------------------------------------------------------------------------*/

	public Alumno(String dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	/*----------------------------------------------------------------------------*/

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

}
