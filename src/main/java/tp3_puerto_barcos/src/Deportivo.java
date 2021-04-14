package tp3_puerto_barcos.src;

public abstract class Deportivo extends Barco {

	private double potencia;
	private int factorAerodinamico;
	protected final double ICP = 0.35;

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getFactorAerodinamico() {
		return factorAerodinamico;
	}

	public void setFactorAerodinamico(int factorAerodinamico) {
		this.factorAerodinamico = factorAerodinamico;
	}

	public double calcularConsumo() {
		return (potencia / factorAerodinamico * ICP);
	}

	@Override
	public double calcularCostoAdicional() {
		return (getValorAdicional() * (getPotencia() / 2));
	}

}
