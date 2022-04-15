package ar.edu.ort.p1.examenes.gestion_auditorias.src;

public class Sistema implements Auditable {

	private final static int MAX_CANT_USUARIOS = 500;
	private String nombre;
	private boolean poseeDatosClientes;
	private int cantUsuarios;

	public Sistema(String nombre, boolean poseeDatosClientes, int cantUsuarios) {
		super();
		this.nombre = nombre;
		this.poseeDatosClientes = poseeDatosClientes;
		this.cantUsuarios = cantUsuarios;
	}

	/**
	 * Ejercicio E: El metodo getNivelCriticidad() que permita calcular para
	 * cualquier elemento auditable (Sistema o Proceso) su nivel de criticidad para
	 * el negocio.
	 */
	@Override
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
