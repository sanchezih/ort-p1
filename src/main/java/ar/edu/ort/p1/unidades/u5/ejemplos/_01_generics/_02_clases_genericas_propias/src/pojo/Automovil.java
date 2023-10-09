package ar.edu.ort.p1.unidades.u5.ejemplos._01_generics._02_clases_genericas_propias.src.pojo;

public class Automovil {
	private String marca;
	private String modelo;

	/*----------------------------------------------------------------------------*/

	public Automovil(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	/*----------------------------------------------------------------------------*/

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
