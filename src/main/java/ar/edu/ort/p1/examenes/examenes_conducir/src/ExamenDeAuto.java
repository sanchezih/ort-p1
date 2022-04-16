package ar.edu.ort.p1.examenes.examenes_conducir.src;

public class ExamenDeAuto extends Examen {

	private final static int SEG_MIN = 90;
	private Circuito circuito;
	private Auto auto;

	public ExamenDeAuto(Persona persona, Circuito circuito, Auto auto) {
		super(persona);
		this.circuito = circuito;
		this.auto = auto;
	}

	@Override
	public boolean isAprobado() {
		return this.circuito.isAprobado() && getTiempo() <= SEG_MIN;
	}

	public double getTiempo() {
		return this.circuito.getTiempoEnSeg();
	}
}
