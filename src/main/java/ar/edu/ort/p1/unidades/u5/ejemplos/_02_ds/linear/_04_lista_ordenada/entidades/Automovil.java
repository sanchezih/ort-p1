package ar.edu.ort.p1.unidades.u5.ejemplos._02_ds.linear._04_lista_ordenada.entidades;

public class Automovil {

	private String marca;
	private String anio;

	public Automovil(String marca, String anio) {
		super();
		this.marca = marca;
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "[" + marca + " " + anio + "]";
	}

}
