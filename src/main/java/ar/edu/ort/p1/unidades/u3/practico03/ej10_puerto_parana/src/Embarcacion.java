package ar.edu.ort.p1.unidades.u3.practico03.ej10_puerto_parana.src;

public abstract class Embarcacion {

	private String matricula;
	private double eslora;
	private int anioFabricacion;
	private String duenio;
	private double valorBase; // Valor definido por la administracion del puerto para cada embarcacion
	private double valorAdicional; // La administracion del puerto define un valorAdicional para cada embarcacion

	public Embarcacion(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.duenio = duenio;
		this.valorBase = valorBase;
		this.valorAdicional = valorAdicional;
	}

	private double getPrecioBase() {
		return this.valorBase * this.eslora;
	}

	public double getValorAdicional() {
		return this.valorAdicional;
	}

	/*----------------------------------------------------------------------------*/

	public double getMontoAlquiler() {
		return getPrecioBase() + getPrecioAdicional();
	}

	public abstract double getPrecioAdicional();

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Embarcacion " + matricula;
	}

}
