package ar.edu.ort.p1.extra.examenes._2021c2._1p_gestionauditorias.src;

public class ObservacionExterna extends Observacion {
	private static final int CANT_DIAS_MAX = 60;
	private String nombreConsultora;

	/*----------------------------------------------------------------------------*/

	/**
	 * Tema 2 - Ejercicio C: El metodo estaVencida() que permita determinar cuando
	 * una observacion esta vencida de acuerdo a los criterios citados.
	 */
	@Override
	public boolean estaVencida() {
		Compromiso compromisoVencido = buscarCompromisoVencido(CANT_DIAS_MAX);
		return compromisoVencido != null ? true : false;
	}

}
