package edu.ort.p1.u5.practico05.ej10;



public class ElectorConMesa extends Elector {
	private int nroMesa;

	public ElectorConMesa(int dni, String apellido, String nombre, int nroMesa) {
		super(dni, apellido, nombre);
		setNroMesa(nroMesa);
	}

	public Elector generarElectorSinMesa() {
		return new Elector(getDni(), getApellido(), getNombre());
	}

	public int getNroMesa() {
		return nroMesa;
	}
	
	private void setNroMesa(int nroMesa) {
		this.nroMesa = nroMesa;
	}


}