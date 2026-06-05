package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

public class Acreditacion {
	private int dni;
	private String nombre;

	/*----------------------------------------------------------------------------*/

	public Acreditacion(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	/*----------------------------------------------------------------------------*/

	public int getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Acreditacion [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
