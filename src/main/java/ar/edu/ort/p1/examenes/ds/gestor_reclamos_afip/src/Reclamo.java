package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Reclamo {

	private double impuestoCobrado;
	private int dni;
	private boolean aLugar;

	public Reclamo(double impuestoCobrado, int dni, boolean aLugar) {
		super();
		this.impuestoCobrado = impuestoCobrado;
		this.dni = dni;
		this.aLugar = aLugar;
	}

	public int getDni() {
		return dni;
	}

	public double getImpuestoCobrado() {
		return impuestoCobrado;
	}

	@Override
	public String toString() {
		return "Reclamo [impuestoCobrado=" + impuestoCobrado + ", dni=" + dni + "]";
	}

}
