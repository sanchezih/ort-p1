package tp3_bicicleteria.src;

public abstract class Bicicleta {
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

}
