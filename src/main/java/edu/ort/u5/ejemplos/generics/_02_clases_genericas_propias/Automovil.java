package edu.ort.u5.ejemplos.generics._02_clases_genericas_propias;

public class Automovil {
	private String marca;
	private String modelo;

	public Automovil(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

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

}
