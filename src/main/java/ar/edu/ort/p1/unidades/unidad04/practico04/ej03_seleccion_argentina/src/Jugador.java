package ar.edu.ort.p1.unidades.unidad04.practico04.ej03_seleccion_argentina.src;

public class Jugador {
	private String apellido;
	private int nroCamiseta;
	private Posicion posicion;

	/*----------------------------------------------------------------------------*/

	public Jugador(String apellido, int nroCamiseta, Posicion posicion) {
		this.apellido = apellido;
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
	}

	/*----------------------------------------------------------------------------*/

	public String getApellido() {
		return apellido;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public Posicion getPosicion() {
		return posicion;
	}

}
