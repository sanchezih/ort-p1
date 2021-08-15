package ar.edu.ort.p1.u3.practico03.ej05_bicicleteria.src;

public abstract class Bicicleta {
	
	private static int KM_MAX_PERMITIDO = 2000;
	private String marca;
	private String modelo;
	private double kilometraje;

	public Bicicleta(String marca, String modelo, double kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
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

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public boolean isReparable() {
		return this.kilometraje < KM_MAX_PERMITIDO;
	}
}
