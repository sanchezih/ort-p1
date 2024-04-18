package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

import ar.edu.ort.p1.util.Fecha;

public class ObservacionExterna extends Observacion {

	private static final int CANT_DIAS_MAX = 60;
	private String nombreConsultora;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param titulo
	 * @param descripcion
	 * @param auditor
	 * @param fechaAlta
	 * @param auditable
	 * @param nombreConsultora
	 */
	public ObservacionExterna(String titulo, String descripcion, Empleado auditor, Fecha fechaAlta, Auditable auditable,
			String nombreConsultora) {
		super(titulo, descripcion, auditor, fechaAlta, auditable);
		this.nombreConsultora = nombreConsultora;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo estaVencida() que permita determinar cuando una
	 * observacion esta vencida de acuerdo a los criterios citados.
	 */
	@Override
	public boolean estaVencida() {
		Compromiso compromisoVencido = buscarCompromisoVencido(CANT_DIAS_MAX);
		return compromisoVencido != null ? true : false;
	}

}
