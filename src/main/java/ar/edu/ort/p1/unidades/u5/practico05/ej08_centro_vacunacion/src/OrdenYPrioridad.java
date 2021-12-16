package ar.edu.ort.p1.unidades.u5.practico05.ej08_centro_vacunacion.src;

public class OrdenYPrioridad {
	private int orden;
	private int prioridad;

	public OrdenYPrioridad(int orden, int prioridad) {
		this.orden = orden;
		this.prioridad = prioridad;
	}

	public int getOrden() {
		return orden;
	}

	private void setOrden(int orden) {
		this.orden = orden;
	}

	public int getPrioridad() {
		return prioridad;
	}

	private void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

}
