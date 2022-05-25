package ar.edu.ort.p1.examenes.oop.examenes_conducir.src;

public class ExamenDeAuto extends Examen {

	private final static int TIEMPO_MAXIMO_PERMITIDO = 90;
	private Circuito circuito;
	private Auto auto;

	public ExamenDeAuto(String fecha, Persona persona, Circuito circuito, Auto auto) {
		super(fecha, persona);
		this.circuito = circuito;
		this.auto = auto;
	}

	@Override
	public boolean isAprobado() {
		return this.circuito.isAprobado() && getTiempo() <= TIEMPO_MAXIMO_PERMITIDO;
	}

	public double getTiempo() {
		return this.circuito.getTiempoEnSeg();
	}
}
