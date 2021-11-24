package ar.edu.ort.p1.extra.examenes.gestion_tareas.src;

import java.util.ArrayList;

public class ErrorEnProduccion extends Error {

	private static final int STOPPER = 8;
	private static final int NO_STOPPER = 16;

	private boolean esStopper;
	private String nombreDelAmbienteDelCliente;

	public ErrorEnProduccion(String ambiente, ArrayList<String> casosDePrueba, boolean esStopper,
			String nombreDelAmbienteDelCliente) {
		super(ambiente, casosDePrueba);
		this.esStopper = esStopper;
		this.nombreDelAmbienteDelCliente = nombreDelAmbienteDelCliente;
	}

	public Prioridad calcularPrioridad() {
		Prioridad prioridad;
		int tiempoEstimado = obtenerTiempoDeResolucion();
		if (tiempoEstimado <= 8) {
			prioridad = Prioridad.ALTA;
		} else {
			prioridad = Prioridad.MEDIA;
		}
		return prioridad;
	}

	@Override
	public int obtenerTiempoDeResolucion() {
		int tiempo;
		if (this.esStopper) {
			tiempo = this.STOPPER;
		} else {
			tiempo = this.NO_STOPPER;
		}
		return tiempo;
	}

}
