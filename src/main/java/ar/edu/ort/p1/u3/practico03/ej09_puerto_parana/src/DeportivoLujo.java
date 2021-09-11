package ar.edu.ort.p1.u3.practico03.ej09_puerto_parana.src;

public class DeportivoLujo extends Deportivo {

	public double getConsumo() {
		return 2 * getPotenciaMotor() * GET_INDICE_CALC_POTENCIA();
	}
}
