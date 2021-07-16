package edu.ort.p1.u3.practico03.tp3_cabinas_peaje.src.mediosdepago;

import edu.ort.p1.u3.practico03.tp3_cabinas_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}
