package ar.edu.ort.p1.u3.practico03.ej10_comercio_informatico.src;

import ar.edu.ort.p1.util.Matematica;

public class ServicioDeReparacion extends Servicio {

	private final static int DIFICULTAD_MIN = 1;
	private final static int DIFICULTAD_MAX = 5;
	private final static double VALOR_HORA = 180;
	private final static int INCR_DIF = 25;
	private final static int MIN_DIFIC = 3;
	private final static int LIMITE_DE_SIMPLEZA = 2;
	private int dificultad;

	public ServicioDeReparacion(int dificultad, int cantHoras) {
		super(cantHoras);
		this.dificultad = dificultad;
	}

	@Override
	public double getPrecio() {
		double precioBase = super.getPrecio();

		/* Usamos operador ternario (condition ? v_true : v_false) */
		return this.dificultad > MIN_DIFIC ? Matematica.sumarPorcentaje(precioBase, INCR_DIF) : precioBase;
	}

	public boolean esServicioSimple() {
		return this.dificultad < LIMITE_DE_SIMPLEZA;
	}

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}
}
