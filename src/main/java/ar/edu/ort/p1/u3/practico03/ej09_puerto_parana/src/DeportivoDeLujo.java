package ar.edu.ort.p1.u3.practico03.ej09_puerto_parana.src;

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
