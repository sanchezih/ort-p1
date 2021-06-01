package edu.ort.u5.tp5.ej02_pelotas_tenis;

public class PelotaDeTenis {

	private static int USOS_HASTA_GASTADA=7;
	private int cantUsos;
	private Estado estado;

	public PelotaDeTenis() {
		this.cantUsos = 0;
		this.estado = Estado.NUEVA;
	}

	public int getCantUsos() {
		return cantUsos;
	}

	public void setCantUsos(int cantUsos) {
		this.cantUsos = cantUsos;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
