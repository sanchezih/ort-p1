package tp3_bicicleteria.src;

public class BicicletaElectrica extends Bicicleta {
	private double potencia;

	public BicicletaElectrica(String marca, String modelo, double kilometraje, double potencia) {
		super(marca, modelo, kilometraje);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
