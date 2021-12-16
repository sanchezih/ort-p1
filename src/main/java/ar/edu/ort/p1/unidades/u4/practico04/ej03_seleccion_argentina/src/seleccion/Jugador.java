package ar.edu.ort.p1.unidades.u4.practico04.ej03_seleccion_argentina.src.seleccion;

public class Jugador {
	private String apellido;
	private int nroCamiseta;
	private Posicion posicion;

	public Jugador(String apellido, int nroCamiseta, Posicion posicion) {
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
