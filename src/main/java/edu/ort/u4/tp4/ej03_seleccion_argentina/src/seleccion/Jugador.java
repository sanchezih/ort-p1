package edu.ort.u4.tp4.ej03_seleccion_argentina.src.seleccion;

public class Jugador {
	private String apellido;
	private int nroCamiseta;
	private Posicion posicion;

	public Jugador(String apellido, int nroCamiseta, Posicion posicion) {
		super();
		this.apellido = apellido;
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}
