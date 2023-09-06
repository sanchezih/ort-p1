package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

public class Circuito implements Evaluable {

	private final static int MAX_FALTAS = 2;

	private int tiempoEnSeg;
	private int nroFaltas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param tiempoEnSeg
	 * @param nroFaltas
	 */
	public Circuito(int tiempoEnSeg, int nroFaltas) {
		super();
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
