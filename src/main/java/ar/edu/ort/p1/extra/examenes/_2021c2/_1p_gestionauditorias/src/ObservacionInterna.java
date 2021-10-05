package ar.edu.ort.p1.extra.examenes._2021c2._1p_gestionauditorias.src;

public class ObservacionInterna extends Observacion {
	private static final int CANT_DIAS_MAX = 90;
	private boolean revision;

	/*----------------------------------------------------------------------------*/

	/**
	 * Tema 2 - Ejercicio C: El metodo estaVencida() que permita determinar cuando
	 * una observacion esta vencida de acuerdo a los criterios citados.
	 */
	@Override
	public boolean estaVencida() {
		Compromiso compromisoVencido = null;
		boolean resultado = false;
		if (!revision) {
			compromisoVencido = buscarCompromisoVencido(CANT_DIAS_MAX);
			resultado = compromisoVencido != null ? true : false;
		}
		return resultado;
	}

}
