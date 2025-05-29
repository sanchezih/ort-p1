package ar.edu.ort.p1.examenes._02_ds.todolibre.src;

public class SucursalCorreo {

	private String nombre;
	private Domicilio domicilio;

	/*----------------------------------------------------------------------------*/

	public SucursalCorreo(String nombre, Domicilio domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}

	/*----------------------------------------------------------------------------*/

	public Domicilio getDomicilio() {
		return domicilio;
	}

}
