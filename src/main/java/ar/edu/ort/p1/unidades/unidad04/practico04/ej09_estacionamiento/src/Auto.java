package ar.edu.ort.p1.unidades.unidad04.practico04.ej09_estacionamiento.src;

import ar.edu.ort.p1.util.Fecha;

public class Auto {

	private static int CANT_PAGOS = 12;

	private String patente;
	private Pago[] pagos = new Pago[CANT_PAGOS];
	private Fecha fechaIngreso;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 * @param pagos
	 * @param fechaIngreso
	 */
	public Auto(String patente, Pago[] pagos, Fecha fechaIngreso) {
		super();
		this.patente = patente;
		this.pagos = pagos;
		this.fechaIngreso = fechaIngreso;
	}

	/*----------------------------------------------------------------------------*/

	public String getPatente() {
		return patente;
	}

	public Pago[] getPagos() {
		return pagos;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @return
	 */
	public int getMesesImpagos() {
		int cantMesesImpagos = -1;
		int idxMesBajo = (this.fechaIngreso.getAnio() < Fecha.getAnioActual()) ? 0 : this.fechaIngreso.getMes();
		int idxMesAlto = Fecha.hoy().getMes();

		for (int i = idxMesAlto; i >= idxMesBajo; i--) {
			if (pagos[i] == null || pagos[i].getMonto() <= 0) {
				cantMesesImpagos++;
			}
		}
		return cantMesesImpagos;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "[Auto=" + patente + "]";
	}

}
