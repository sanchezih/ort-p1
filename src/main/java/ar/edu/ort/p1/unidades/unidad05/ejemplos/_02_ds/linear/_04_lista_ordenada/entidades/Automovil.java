package ar.edu.ort.p1.unidades.unidad05.ejemplos._02_ds.linear._04_lista_ordenada.entidades;

public class Automovil {

	private String marca;
	private String anio;

	/*----------------------------------------------------------------------------*/

	public Automovil(String marca, String anio) {
		this.marca = marca;
		this.anio = anio;
	}

	/*----------------------------------------------------------------------------*/

	public String getMarca() {
		return marca;
	}

	public String getAnio() {
		return anio;
	}

	@Override
	public String toString() {
		return "[" + marca + " " + anio + "]";
	}

}
