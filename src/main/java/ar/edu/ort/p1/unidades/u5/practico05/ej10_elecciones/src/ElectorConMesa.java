package ar.edu.ort.p1.unidades.u5.practico05.ej10_elecciones.src;

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