package edu.ort.p1.u3.tp3.tp3_puerto_barcos.src;

public class DeportivoDeLujo extends Deportivo {
	private final static int MULTIPLICADOR = 2;

	public DeportivoDeLujo(String matricula, double eslora, int anioFabricacion, String nombreDuenio, double potencia,
			int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, nombreDuenio, potencia, factorAerodinamico);
	}

	@Override
	public double calcularConsumo() {
		return (MULTIPLICADOR * this.potencia * ICP);
	}

}
