package ar.edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

public class Registro {

	private String patente;
	private Fecha fechaRetiro;

	public Registro(String patente, Fecha fechaRetiro) {
		super();
		this.patente = patente;
		this.fechaRetiro = fechaRetiro;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Fecha getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Fecha fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

}
