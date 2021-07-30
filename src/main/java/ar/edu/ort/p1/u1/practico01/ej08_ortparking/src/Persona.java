package ar.edu.ort.p1.u1.practico01.ej08_ortparking.src;

public class Persona {

	private String dni;
	private String nombreCompleto;

	public Persona(String dni, String nombreCompleto) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombreCompleto=" + nombreCompleto + "]";
	}

}
