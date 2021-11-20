package ar.edu.ort.p1.extra.examenes.gestion_auditorias.src;

public class Sistema implements Auditable {
	private final static int MAX_CANT_USUARIOS = 500;
	private String nombre;
	private boolean poseeDatosClientes;
	private int cantUsuarios;

	/**
	 * Tema 1 - Ejercicio C: El metodo getNivelCriticidad() que permita calcular
	 * para cualquier elemento auditable (Sistema o Proceso) su nivel de criticidad
	 * para el negocio.
	 */
	@Override // sobreescritura al implementar interface
	public int getNivelCriticidad() {
		int nivel = 0;
		if (poseeDatosClientes) {
			nivel = 1;
			if (cantUsuarios > MAX_CANT_USUARIOS) {
				nivel = 2;
			}
		}
		return nivel;
	}

}
