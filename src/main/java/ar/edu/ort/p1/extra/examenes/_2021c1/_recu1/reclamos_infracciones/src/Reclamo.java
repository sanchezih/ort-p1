package edu.ort.p1.extra.examenes._2021c1._recu1.reclamos_infracciones.src;

public class Reclamo {

	private String dni;
	private boolean aceptado;
	private Infraccion infraccionReclamada;

	public Reclamo(String dni, boolean aceptado, Infraccion infraccionReclamada) {
		super();
		this.dni = dni;
		this.aceptado = aceptado;
		this.infraccionReclamada = infraccionReclamada;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public Infraccion getInfraccionReclamada() {
		return infraccionReclamada;
	}

	public void setInfraccionReclamada(Infraccion infraccionReclamada) {
		this.infraccionReclamada = infraccionReclamada;
	}

	@Override
	public String toString() {
		return "Reclamo [dni=" + dni + ", aceptado=" + aceptado + ", infraccionReclamada=" + infraccionReclamada + "]";
	}

}
