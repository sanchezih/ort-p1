package ar.edu.ort.p1.examenes.gestion_auditorias.src;

public class Proceso implements Auditable {

	private final static int MAX_CANT_ACTIVIDADES = 7;
	private String codigo;
	private int cantActividades;
	private boolean impactaCliente;
	private boolean afectaPatrimonioCompania;

	/**
	 * Tema 1 - Ejercicio C: El metodo getNivelCriticidad() que permita calcular
	 * para cualquier elemento auditable (Sistema o Proceso) su nivel de criticidad
	 * para el negocio.
	 */
	@Override // sobreescritura al implementar interface
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
