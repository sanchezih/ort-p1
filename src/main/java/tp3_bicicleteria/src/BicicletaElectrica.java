package tp3_bicicleteria.src;

public class BicicletaElectrica extends Bicicleta {
	private static int POTENCIA_MAX_PERMITIDA = 250;
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

	@Override
	public boolean isReparable() {
		if (super.isReparable() && this.potencia <= POTENCIA_MAX_PERMITIDA) {
			return true;
		} else {
			return false;
		}
	}

}
