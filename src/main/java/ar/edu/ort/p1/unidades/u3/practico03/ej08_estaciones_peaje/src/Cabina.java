package ar.edu.ort.p1.unidades.u3.practico03.ej08_estaciones_peaje.src;

import java.util.ArrayList;

import ar.edu.ort.p1.unidades.u3.practico03.ej08_estaciones_peaje.src.mediosdepago.MedioDePago;

public class Cabina {

	private static final int HP1_HORA_MIN = 6;
	private static final int HP1_HORA_MAX = 10;

	private static final int HP2_HORA_MIN = 17;
	private static final int HP2_HORA_MAX = 20;

	private static final double INCR_H_PICO = 0.08;
	private int id;
	private MedioDePago medioDePago;
	private ArrayList<Empleado> empleadosHabilitados;

	public Cabina(int id, MedioDePago medioDePago) {
		super();
		this.id = id;
		this.medioDePago = medioDePago;
		this.empleadosHabilitados = new ArrayList<Empleado>();
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo cobrar que reciba como parametro un
	 * vehiculo y devuelva el importe final a cobrarle.
	 * 
	 * @param vehiculo
	 * @return
	 */
	public double cobrar(Vehiculo vehiculo) {
		double importeFinal = 0;

		importeFinal = vehiculo.getCategoria().getTarifa();
		if (abonaIncrementoHoraPico()) {
			importeFinal = importeFinal + importeFinal * INCR_H_PICO;
		}
		importeFinal = importeFinal - importeFinal * this.medioDePago.getDescuento();
		return importeFinal;
	}

	private boolean abonaIncrementoHoraPico() {
		int horaActual = 0;
		horaActual = Integer.parseInt(EstacionDePeaje.dameHoraActual());
		return esHoraPico(horaActual);
	}

	public boolean esHoraPico(int h) {
		return (h >= HP1_HORA_MIN && h <= HP1_HORA_MAX) || (h >= HP2_HORA_MIN && h <= HP2_HORA_MAX);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Cabina [id=" + id + ", medioDePago=" + medioDePago + "]";
	}

}
