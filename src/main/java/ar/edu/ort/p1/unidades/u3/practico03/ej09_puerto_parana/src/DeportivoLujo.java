package ar.edu.ort.p1.unidades.u3.practico03.ej09_puerto_parana.src;

public class DeportivoLujo extends Deportivo {

	public DeportivoLujo(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int potenciaMotor, int factorAerodinamico) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional, potenciaMotor, factorAerodinamico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularConsumo() {
		return 2 * getPotenciaMotor() * GET_INDICE_CALCULO_POTENCIA();
	}
}
