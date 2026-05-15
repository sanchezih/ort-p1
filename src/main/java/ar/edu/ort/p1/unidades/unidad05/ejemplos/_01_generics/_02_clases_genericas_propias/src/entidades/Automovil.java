package ar.edu.ort.p1.unidades.unidad05.ejemplos._01_generics._02_clases_genericas_propias.src.entidades;

public class Automovil {

	private String marca;
	private String modelo;

	/*----------------------------------------------------------------------------*/

	public Automovil(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	/*----------------------------------------------------------------------------*/

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
