package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public abstract class Embarcacion {

	private String matricula;
	private double eslora;
	private int anioFabricacion;
	private String duenio;
	private double valorBase;
	private double valorAdicional;

	private double precioBase() {
		return this.valorBase * this.eslora;
	}

	public double getMontoAlquiler() {
		return precioBase() + precioAdicional();
	}

	public double getValorAdicional() {
		return 0;
	}

	public abstract double precioAdicional();

}
