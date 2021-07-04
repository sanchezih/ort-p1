package edu.ort.p1.extra.examenes._2021c1._recu.municipalidad_solicitudes.src;

public abstract class Solicitud implements Valorable {

	private double costoBase;
	private Fecha fecha;

	public Solicitud(double costoBase, Fecha fecha) {
		super();
		this.costoBase = costoBase;
		this.fecha = fecha;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public abstract boolean vencido();

	public Mes mes() {
		return this.fecha.getMes();

	}

	protected Fecha verFecha() {
		return fecha;

	}

	@Override
	public String toString() {
		return "costoBase=" + costoBase + ", fecha=" + fecha.toString();
	}

}
