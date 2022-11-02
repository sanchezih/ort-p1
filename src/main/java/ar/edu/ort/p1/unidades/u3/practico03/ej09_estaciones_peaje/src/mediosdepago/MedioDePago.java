package ar.edu.ort.p1.unidades.u3.practico03.ej09_estaciones_peaje.src.mediosdepago;

import ar.edu.ort.p1.unidades.u3.practico03.ej09_estaciones_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}
