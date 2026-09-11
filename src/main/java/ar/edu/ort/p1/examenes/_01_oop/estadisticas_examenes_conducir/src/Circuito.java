package ar.edu.ort.p1.examenes._01_oop.estadisticas_examenes_conducir.src;

public class Circuito implements Evaluable {

	private static final int MAX_FALTAS = 2;

	private int tiempoEnSeg;
	private int nroFaltas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param tiempoEnSeg
	 * @param nroFaltas
	 */
	public Circuito(int tiempoEnSeg, int nroFaltas) {
		this.tiempoEnSeg = tiempoEnSeg;
		this.nroFaltas = nroFaltas;
	}

	/*----------------------------------------------------------------------------*/

	public int getTiempoEnSeg() {
		return tiempoEnSeg;
	}

	@Override
	public boolean isAprobado() {
		return this.nroFaltas <= MAX_FALTAS;
	}

}
