package edu.ort.u3.tp3.tp3_cabinas_peaje.src.mediosdepago;

import edu.ort.u3.tp3.tp3_cabinas_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}
