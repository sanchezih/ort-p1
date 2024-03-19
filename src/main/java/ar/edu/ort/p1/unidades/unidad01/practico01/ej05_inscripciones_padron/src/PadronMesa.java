package ar.edu.ort.p1.unidades.unidad01.practico01.ej05_inscripciones_padron.src;

public class PadronMesa {
	private int numeroMesa;
	private int orden;
	private String dni;
	private String nombreApellido;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param numeroMesa
	 * @param orden
	 * @param dni
	 * @param nombreApellido
	 */
	public PadronMesa(int numeroMesa, int orden, String dni, String nombreApellido) {
		this.numeroMesa = numeroMesa;
		this.orden = orden;
		this.dni = dni;
		this.nombreApellido = nombreApellido;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "PadronMesa [numeroMesa=" + numeroMesa + ", orden=" + orden + ", dni=" + dni + ", nombreApellido="
				+ nombreApellido + "]";
	}
}
