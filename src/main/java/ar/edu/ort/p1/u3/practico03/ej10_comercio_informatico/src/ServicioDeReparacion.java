package ar.edu.ort.p1.u3.practico03.ej10_comercio_informatico.src;

public class ServicioDeReparacion extends Servicio {

	private static int DIFICULTAD_MIN = 1;
	private static int DIFICULTAD_MAX = 5;
	private static double VALOR_POR_HORA = 180;
	private static int INCREMENTO = 25;
	private static int DIFICULTAD_LIMIT = 3;
	private static int LIMITE_DE_SIMPLEZA = 2;
	private int nivelDificultad;

	public ServicioDeReparacion(int nivelDificultad, int cantidadDeHoras) {
		super(cantidadDeHoras);
		this.nivelDificultad = nivelDificultad;
	}

	@Override
	public double getCosto() {
		double costoBase = super.getCosto();
		// Usamos operador ternario (condition ? v_true : v_false)
		return nivelDificultad > DIFICULTAD_LIMIT ? Matematica.sumarPorcentaje(costoBase, INCREMENTO) : costoBase;
	}

	public boolean esServicioSimple() {
		return this.nivelDificultad < LIMITE_DE_SIMPLEZA;
	}

	@Override
	public double getValorHora() {
		return VALOR_POR_HORA;
	}
}
