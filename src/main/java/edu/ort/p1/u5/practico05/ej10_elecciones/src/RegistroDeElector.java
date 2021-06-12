package edu.ort.p1.u5.practico05.ej10_elecciones.src;

public class RegistroDeElector {
	private int dni;
	private int nroDeMesa;
	private int nroDeOrden;

	public RegistroDeElector(int dni, int nroDeMesa, int nroDeOrden) {
		this.dni = dni;
		this.nroDeMesa = nroDeMesa;
		this.nroDeOrden = nroDeOrden;
	}

	@Override
	public String toString() {
		return "RegistroDeElector [dni=" + dni + ", nroDeMesa=" + nroDeMesa + ", nroDeOrden=" + nroDeOrden + "]";
	}

}