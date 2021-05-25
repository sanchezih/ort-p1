package edu.ort.u5.ejemplos.generics._03_metodos_genericos;

public class Automovil {
	private String marca;
	private String modelo;

	public Automovil(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
