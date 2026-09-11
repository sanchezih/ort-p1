package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public abstract class Musical extends Obra {

	private static final int OBERTURA = 5;

	private boolean orquestaVivo;

	/*----------------------------------------------------------------------------*/

	public Musical(String nombre, int duracion, int cantLocalidades, boolean orquestaVivo) {
		super(nombre, duracion, cantLocalidades);
		this.orquestaVivo = orquestaVivo;
	}

	/*----------------------------------------------------------------------------*/

	public int getDuracion() {
		return super.getDuracion() + OBERTURA;
	}

}
