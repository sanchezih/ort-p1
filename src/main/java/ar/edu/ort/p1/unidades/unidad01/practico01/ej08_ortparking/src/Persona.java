package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

public class Persona {

	private String dni;
	private String nombreCompleto;

	/*----------------------------------------------------------------------------*/

	public Persona(String dni, String nombreCompleto) {
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}

}
