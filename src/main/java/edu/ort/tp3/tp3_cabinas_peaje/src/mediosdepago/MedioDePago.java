package edu.ort.tp3.tp3_cabinas_peaje.src.mediosdepago;

import edu.ort.tp3.tp3_cabinas_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}
