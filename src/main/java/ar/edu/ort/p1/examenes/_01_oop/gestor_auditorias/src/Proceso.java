package ar.edu.ort.p1.examenes._01_oop.gestor_auditorias.src;

public class Proceso implements Auditable {

	private static final int MAX_CANT_ACTIVIDADES = 7;

	private String codigo;
	private int cantActividades;
	private boolean impactaCliente;
	private boolean afectaPatrimonioCompania;

	/*----------------------------------------------------------------------------*/

	public Proceso(String codigo, int cantActividades, boolean impactaCliente, boolean afectaPatrimonioCompania) {
		this.codigo = codigo;
		this.cantActividades = cantActividades;
		this.impactaCliente = impactaCliente;
		this.afectaPatrimonioCompania = afectaPatrimonioCompania;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio E: El metodo getNivelCriticidad() que permita calcular para
	 * cualquier elemento auditable (Sistema o Proceso) su nivel de criticidad para
	 * el negocio.
	 */
	@Override
	public int getNivelCriticidad() {
		int nivel = 0;

		if (impactaCliente) {
			nivel = 1;
			if (cantActividades > MAX_CANT_ACTIVIDADES && afectaPatrimonioCompania) {
				nivel = 2;
			}
		}
		return nivel;
	}
}
