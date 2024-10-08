package ar.edu.ort.p1.unidades.unidad03.practico03.ej11_comercio_informatico.src;

import com.github.sanchezih.util.math.Matematica;

public class ServicioDeReparacion extends Servicio {

	private static final double VALOR_HORA = 180;
	private static final int INCR_DIF = 25;
	private static final int MIN_DIFIC = 3;
	private static final int LIMITE_DE_SIMPLEZA = 2;

	private int dificultad;

	/**
	 * 
	 * @param dificultad
	 * @param cantHoras
	 */
	public ServicioDeReparacion(int dificultad, int cantHoras) {
		super(cantHoras);
		this.dificultad = dificultad;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public double getPrecio() {
		double precioBase = super.getPrecio();
		return this.dificultad > MIN_DIFIC ? Matematica.sumarPorcentaje(precioBase, INCR_DIF) : precioBase;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Metodo que devuelve true si el servicio tiene una dificultad del servicio de
	 * reparacion es menor a LIMITE_DE_SIMPLEZA. Devuelve false en caso contrario
	 * 
	 * @return
	 */
	public boolean esServicioSimple() {
		return this.dificultad < LIMITE_DE_SIMPLEZA;
	}

}
