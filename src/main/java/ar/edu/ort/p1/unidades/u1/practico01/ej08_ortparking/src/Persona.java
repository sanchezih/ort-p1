package ar.edu.ort.p1.unidades.u1.practico01.ej08_ortparking.src;

public class Persona {

	private String dni;
	private String nombreCompleto;

	public Persona(String dni, String nombreCompleto) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}

}
