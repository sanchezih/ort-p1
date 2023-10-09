package ar.edu.ort.p1.unidades.u5.practico05.ej01_libros_dvds.src;

public class DVD {
	private String marca;
	private boolean rayado;

	/*----------------------------------------------------------------------------*/

	public DVD(String marca, boolean rayado) {
		super();
		this.marca = marca;
		this.rayado = rayado;
	}

	/*----------------------------------------------------------------------------*/

	public boolean isRayado() {
		return rayado;

	}

}
