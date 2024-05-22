package ar.edu.ort.p1.unidades.unidad05.practico05.ej02_pelotas_tenis.src;

public class PelotaDeTenis {

	public final int USOS_HASTA_GASTADA = 7;
	private int cantidadDeUsos;
	private Estado estado;

	/*----------------------------------------------------------------------------*/

	public PelotaDeTenis() {
		this.cantidadDeUsos = 0;
		this.setEstado(Estado.NUEVA);
	}

	/*----------------------------------------------------------------------------*/

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void usar() {
		this.cantidadDeUsos++;
		actualizarEstado();
	}

	/**
	 * 
	 */
	private void actualizarEstado() {
		if (this.cantidadDeUsos <= USOS_HASTA_GASTADA) {
			this.setEstado(Estado.USADA);
		} else {
			this.setEstado(Estado.GASTADA);
		}
	}

	@Override
	public String toString() {
		return "\tPelotaDeTenis [USOS_HASTA_GASTADA=" + USOS_HASTA_GASTADA + ", cantidadDeUsos=" + cantidadDeUsos
				+ ", estado=" + estado + "]";
	}

}
