package tp3_cabinas_peaje.src.mediosdepago;

import tp3_cabinas_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}
