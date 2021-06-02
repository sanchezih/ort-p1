package edu.ort.p1.u3.practico03.tp3_puerto_barcos.src;

public abstract class Deportivo extends Barco {

	protected double potencia;
	private int factorAerodinamico;
	protected final static double ICP = 0.35;

	public Deportivo(String matricula, double eslora, int anioFabricacion, String nombreDuenio, double potencia,
			int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.potencia = potencia;
		this.factorAerodinamico = factorAerodinamico;
	}

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
		return (this.potencia / this.factorAerodinamico * ICP);
	}

	@Override
	public double calcularAdicional() {
		return VALOR_ADICIONAL * (this.potencia / 2);
	}

}
