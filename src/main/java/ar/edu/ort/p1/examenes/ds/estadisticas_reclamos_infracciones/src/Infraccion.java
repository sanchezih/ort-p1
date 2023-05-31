package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

import ar.edu.ort.p1.util.Fecha;

public abstract class Infraccion implements Caducable {
	
	private double valorUnidad;
	private Fecha fecha;

	public Infraccion(double valorUnidad, Fecha fecha) {
		super();
		this.valorUnidad = valorUnidad;
		this.fecha = fecha;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public void setValorUnidad(double valorUnidad) {
		this.valorUnidad = valorUnidad;
	}

	public abstract double valorInfraccion();

	protected Fecha verFecha() {
		return fecha;
	}

	protected double getValorUnidad() {
		return valorUnidad;
	}

	

	@Override
	public String toString() {
		return "[valorInfraccion=" + valorInfraccion() + ", fecha=" + fecha + "]";
	}

}
