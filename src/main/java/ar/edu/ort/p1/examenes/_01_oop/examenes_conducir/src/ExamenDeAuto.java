package ar.edu.ort.p1.examenes._01_oop.examenes_conducir.src;

public class ExamenDeAuto extends Examen {

	private static final int TIEMPO_MAXIMO_PERMITIDO = 90;

	private Circuito circuito;
	private Auto auto;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fecha
	 * @param persona
	 * @param circuito
	 * @param auto
	 */
	public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
		super(fecha, persona);
		this.circuito = circuito;
		this.auto = auto;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean isAprobado() {
		return this.circuito.isAprobado() && getTiempoDelCircuito() <= TIEMPO_MAXIMO_PERMITIDO;
	}

	/**
	 * 
	 * @return
	 */
	public int getTiempoDelCircuito() {
		return this.circuito.getTiempoEnSeg();
	}
}
