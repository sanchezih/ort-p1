package ar.edu.ort.p1.examenes._02_ds.municipalidad_solicitudes.src;

public class Contacto {

	private String dni;
	private boolean concluido;
	private Solicitud solicitud;

	/*----------------------------------------------------------------------------*/

	public Contacto(String dni, boolean concluido, Solicitud solicitud) {
		this.dni = dni;
		this.concluido = concluido;
		this.solicitud = solicitud;
	}

	/*----------------------------------------------------------------------------*/
	
	public String getDni() {
		return dni;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	@Override
	public String toString() {
		return "Contacto [dni=" + dni + ", concluido=" + concluido + ", solicitud=" + solicitud + "]";
	}

}
