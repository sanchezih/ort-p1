package ar.edu.ort.p1.examenes.municipalidad_solicitudes.src;

public class Contacto {

	private String dni;
	private boolean concluido;
	private Solicitud solicitud;

	public Contacto(String dni, boolean concluido, Solicitud solicitud) {
		super();
		this.dni = dni;
		this.concluido = concluido;
		this.solicitud = solicitud;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	@Override
	public String toString() {
		return "Contacto [dni=" + dni + ", concluido=" + concluido + ", solicitud=" + solicitud + "]";
	}

}
