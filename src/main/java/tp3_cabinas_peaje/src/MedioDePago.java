package tp3_cabinas_peaje.src;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
