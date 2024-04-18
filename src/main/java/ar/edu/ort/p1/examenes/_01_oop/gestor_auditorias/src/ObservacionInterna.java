package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

import ar.edu.ort.p1.util.Fecha;

public class ObservacionInterna extends Observacion {

	private static final int CANT_DIAS_MAX = 90;
	private boolean enRevision;

	/*----------------------------------------------------------------------------*/

	public ObservacionInterna(String titulo, String descripcion, Empleado auditor, Fecha fechaAlta, Auditable auditable,
			boolean enRevision) {
		super(titulo, descripcion, auditor, fechaAlta, auditable);
		this.enRevision = enRevision;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo estaVencida() que permita determinar cuando una
	 * observacion esta vencida de acuerdo a los criterios citados.
	 */
	@Override
	public boolean estaVencida() {
		Compromiso compromisoVencido = null;
		boolean resultado = false;
		if (!enRevision) {
			compromisoVencido = buscarCompromisoVencido(CANT_DIAS_MAX);
			resultado = compromisoVencido != null ? true : false;
		}
		return resultado;
	}

}
