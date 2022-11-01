package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class Reclamo {

	private double impuestoCobrado;
	private int dni;

	/*----------------------------------------------------------------------------*/

	public Reclamo(double impuestoCobrado, int dni) {
		this.impuestoCobrado = impuestoCobrado;
		this.dni = dni;
	}

	/*----------------------------------------------------------------------------*/

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
