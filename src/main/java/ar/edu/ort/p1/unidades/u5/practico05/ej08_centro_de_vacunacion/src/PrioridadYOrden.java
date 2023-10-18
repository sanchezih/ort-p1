package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_de_vacunacion.src;

public class PrioridadYOrden {

	private int prioridad;
	private int orden;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param prioridad
	 * @param orden
	 */
	public PrioridadYOrden(int prioridad, int orden) {
		this.prioridad = prioridad;
		this.orden = orden;
	}

	/*----------------------------------------------------------------------------*/

	public int getPrioridad() {
		return prioridad;
	}

	public int getOrden() {
		return orden;
	}

}
