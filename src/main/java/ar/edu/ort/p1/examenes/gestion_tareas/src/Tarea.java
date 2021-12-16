package ar.edu.ort.p1.examenes.gestion_tareas.src;

public abstract class Tarea implements Estimable {

	private String proyecto;
	private int versionAfectada;
	private int versionACorregir;
	private String titulo;
	private Usuario usuarioQueLaReporto;

	public Prioridad calcularPrioridad() {
		int tiempoEstimado = obtenerTiempoDeResolucion();
		Prioridad prioridad;
		if (tiempoEstimado <= 16) {
			prioridad = Prioridad.ALTA;
		} else {
			if (tiempoEstimado <= 24) {
				prioridad = Prioridad.MEDIA;
			} else {
				prioridad = Prioridad.BAJA;
			}
		}
		return prioridad;
	}

}
