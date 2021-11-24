package ar.edu.ort.p1.extra.examenes.gestion_tareas.src;

public class Desarrollo extends Tarea {

	private String descripcionFuncional;
	private int tiempoEstimado;

	public Desarrollo(String descripcionFuncional, int tiempoEstimado) {
		this.descripcionFuncional = descripcionFuncional;
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		return this.tiempoEstimado;
	}

}
