package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class NominaPorOrdenDeLlegada implements Nomina {

	private int cantidadDeAcreditaciones;
	private Cola<Acreditacion> acreditaciones;

	/*----------------------------------------------------------------------------*/

	public NominaPorOrdenDeLlegada() {
		this.cantidadDeAcreditaciones = 0;
		this.acreditaciones = new ColaNodos<>();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean hayDisponibilidad() {
		return !this.acreditaciones.isFull();
	}

	@Override
	public Acreditacion obtenerAcreditacion(int dni) {
		final Acreditacion acreditacionCentinela = null;
		Acreditacion acreditacion = null;
		Acreditacion acreditacionAEvaluar = null;

		this.acreditaciones.add(acreditacionCentinela);
		acreditacionAEvaluar = this.acreditaciones.remove();

		while (acreditacionAEvaluar != acreditacionCentinela) {
			if (acreditacion == null && acreditacionAEvaluar.getDni() == dni) {
				acreditacion = acreditacionAEvaluar;
			}
			this.acreditaciones.add(acreditacionAEvaluar);
			acreditacionAEvaluar = this.acreditaciones.remove();
		}
		return acreditacion;
	}

	@Override
	public int getCantidadDeAcreditaciones() {
		return cantidadDeAcreditaciones;
	}

	@Override
	public void agregarAcreditacion(Acreditacion acreditacion) {
		this.acreditaciones.add(acreditacion);
		cantidadDeAcreditaciones++;
	}

}
