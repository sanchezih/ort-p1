package ar.edu.ort.p1.unidades.unidad04.practico04.ej09_estacionamiento.src;

import ar.edu.ort.p1.util.Fecha;

public class Registro {

	private String patente;
	private Fecha fechaRetiro;

	/*----------------------------------------------------------------------------*/

	public Registro(String patente, Fecha fechaRetiro) {
		super();
		this.patente = patente;
		this.fechaRetiro = fechaRetiro;
	}

	/*----------------------------------------------------------------------------*/

	public String getPatente() {
		return patente;
	}

	public Fecha getFechaRetiro() {
		return fechaRetiro;
	}

}
