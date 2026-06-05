package ar.edu.ort.p1.examenes._02_ds.biblioteca.src;

public class Alumno extends Usuario {

	private static final int CANT_MAT_MIN = 1;

	private int cantMateriasAprobadas;

	/*----------------------------------------------------------------------------*/

	public Alumno(int edad, String nombre, String dni, int cantMateriasAprobadas) {
		super(edad, nombre, dni);
		this.cantMateriasAprobadas = cantMateriasAprobadas;
	}

	/*----------------------------------------------------------------------------*/

	public boolean cumpleReglaEspecifica() {
		return cantMateriasAprobadas > CANT_MAT_MIN;
	}

}
