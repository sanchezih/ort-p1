package ar.edu.ort.p1.unidades.unidad01.practico01.ej03_ort_informes_carreras.src;

public class AlumnoSimplificado {

	private String nombre;
	private String mail;

	/*----------------------------------------------------------------------------*/

	public AlumnoSimplificado(String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "\n\t\t" + nombre + ", " + mail;
	}

}
