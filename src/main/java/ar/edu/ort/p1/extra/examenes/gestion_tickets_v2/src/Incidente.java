package ar.edu.ort.p1.extra.examenes.gestion_tickets_v2.src;

public class Incidente extends Error {

	private String nombreDelHost;
	private boolean esStopper;
	private final static int STOPPER = 12;
	private final static int NO_STOPPER = 32;

	public Incidente(String nombreDelHost, boolean esStopper) {
		this.nombreDelHost = nombreDelHost;
		this.esStopper = esStopper;
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
